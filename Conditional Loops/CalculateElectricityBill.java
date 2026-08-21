import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        double bill;

        if (units <= 100) {
            bill = units * 1.50;
        } 
        else if (units <= 200) {
            bill = (100 * 1.50)
                 + ((units - 100) * 2.50);
        } 
        else if (units <= 500) {
            bill = (100 * 1.50)
                 + (100 * 2.50)
                 + ((units - 200) * 4.00);
        } 
        else {
            bill = (100 * 1.50)
                 + (100 * 2.50)
                 + (300 * 4.00)
                 + ((units - 500) * 6.00);
        }

        System.out.println("Electricity Bill = ₹" + bill);

        sc.close();
    }
}