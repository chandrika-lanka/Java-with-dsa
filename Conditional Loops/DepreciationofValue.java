import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original value: ");
        double originalValue = sc.nextDouble();

        System.out.print("Enter salvage value: ");
        double salvageValue = sc.nextDouble();

        System.out.print("Enter useful life in years: ");
        int life = sc.nextInt();

        double depreciation =
                (originalValue - salvageValue) / life;

        System.out.println(
            "Depreciation per year = " + depreciation
        );

        sc.close();
    }
}