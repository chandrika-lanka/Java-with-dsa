import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter commission amount: ");
        double commission = sc.nextDouble();

        double commissionPercentage =
                (commission / sales) * 100;

        System.out.println(
            "Commission Percentage = "
            + commissionPercentage + "%"
        );

        sc.close();
    }
}