import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        double sum = 0;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            sum = sum + sc.nextDouble();
        }

        double average = sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}