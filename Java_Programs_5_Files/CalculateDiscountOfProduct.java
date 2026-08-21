import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double discountAmount = (price * discount) / 100;
        double finalPrice = price - discountAmount;

        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Final Price = " + finalPrice);

        sc.close();
    }
}
