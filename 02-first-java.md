Question 1 :
Write a program to print whether a number is even or odd, also take input from the user.
CODE:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
OUTPUT:
7 -ODD
Question 2 :
Take name as input and print a greeting message for that particular name.
CODE:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "! Welcome!");
    }
}
OUTPUT :
Enter your name: Chandrika
Hello, Chandrika! Welcome!
 
 Question 3 :
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
CODE :
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();

        System.out.print("Enter Time: ");
        double T = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100;

        System.out.println("Simple Interest = " + SI);
    }
}
OUTPUT :
Enter Principal: 1000
Enter Time: 1
Enter Rate: 2
Simple Interest = 20.0

Question 4 :
Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
CODE:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result = " + (a + b));
        }
        else if (op == '-') {
            System.out.println("Result = " + (a - b));
        }
        else if (op == '*') {
            System.out.println("Result = " + (a * b));
        }
        else if (op == '/') {
            System.out.println("Result = " + (a / b));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}
OUTPUT:
Enter first number: 10
Enter second number: 5
Enter operator (+, -, *, /): *
Result: 50.0

Question 5:
 Take 2 numbers as input and print the largest number.
CODE-
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest number = " + a);
        } else {
            System.out.println("Largest number = " + b);
        }

        sc.close();
    }
}
OUTPUT-
Enter first number: 45
Enter second number: 89
Largest number = 89

QUESTION-6 Input currency in rupees and output in USD.
CODE-
import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        double exchangeRate = 83.50;

        double usd = rupees / exchangeRate;

        System.out.println("USD = " + usd);

        sc.close();
    }
}
OUTPUT-
Enter amount in Rupees: 8350
USD = 100.0
