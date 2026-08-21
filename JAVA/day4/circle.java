import java.util.Scanner;

public class circle {
    static void area(int r) {
        double area = 3.14 * r * r;

        System.out.println("Area of circle :" + area);
    }

    static void perimeter(int r) {
        
        double perimeter = 2 * 3.14 * r;

        System.out.println("Perimeter of circle :" + perimeter);
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle :");

        int r = sc.nextInt();

        area(r);

        perimeter(r);
        
    }
}
