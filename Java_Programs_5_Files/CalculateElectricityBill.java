import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        double rate;
        if (units <= 100)
            rate = 1.5;
        else if (units <= 300)
            rate = 2.5;
        else
            rate = 4.0;

        double bill = units * rate;

        System.out.println("Electricity Bill = Rs. " + bill);
        sc.close();
    }
}
