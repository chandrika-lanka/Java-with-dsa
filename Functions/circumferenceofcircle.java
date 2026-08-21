import java.util.Scanner;

class Main {

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        System.out.println("Area = " + area(radius));
        System.out.println("Circumference = " + circumference(radius));

        sc.close();
    }
}