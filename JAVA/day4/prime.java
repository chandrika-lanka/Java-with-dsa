import java.util.Scanner;

public class prime {

    static void prime(int num) {

        if (num <= 1) {
            System.out.println("Given number is NOT a PRIME");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Given number is NOT a PRIME");
                return;
            }
        }

        System.out.println("Given number is PRIME");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        prime(num);
    }
}