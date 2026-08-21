import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = price * discountPercent / 100;

        double finalPrice = price - discount;

        System.out.println("Discount = " + discount);
        System.out.println("Final Price = " + finalPrice);

        sc.close();
    }
}