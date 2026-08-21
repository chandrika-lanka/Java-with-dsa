import java.util.Scanner;

public class CalculateAverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += sc.nextDouble();
        }

        double average = sum / n;
        System.out.println("Average = " + average);

        sc.close();
    }
}
