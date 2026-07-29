Question-1:Input a year and find whether it is a leap year or not.
Code:
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        sc.close();
    }
}
Output:
Enter a year: 2024
2024 is a Leap Year.
Question-2:Take two numbers and print the sum of both.
Code:
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two numbers = " + sum);

        sc.close();
    }
}
Output:
Enter first number: 10
Enter second number: 20
Sum of two numbers = 30
Question-3:Take a number as input and print the multiplication table for it.
Code:
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));

        sc.close();
    }
}
Output:
Enter a number: 5
Multiplication table of 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

Question-4:Take 2 numbers as inputs and find their HCF and LCM.
Code:
import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " = " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);

        sc.close();
    }
}
Output:
Enter first number: 12
Enter second number: 18
HCF of 12 and 18 = 6
LCM of 12 and 18 = 36

Question-5:Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.\
Code:
import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or x to stop): ");
            String input = sc.next();

            if (input.equals("x")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
        }

        System.out.println("Sum of all numbers = " + sum);

        sc.close();
    }
}
Output:
Enter a number (or x to stop): 10
Enter a number (or x to stop): 20
Enter a number (or x to stop): 30
Enter a number (or x to stop): x
Sum of all numbers = 60
