Question-1:Area Of Circle Java Program
Code:
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}
Output:
Enter radius: 7
Area of Circle = 153.93804002589985

Question-2:Area Of Triangle
Code:
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);
    }
}

Output:
Enter base: 10
Enter height: 8
Area of Triangle = 40.0

Question-3:Area Of Rectangle Program
Code:
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Area of Rectangle = " + area);
    }
}

Output:
Enter length: 12
Enter width: 5
Area of Rectangle = 60.0

Question-4:Area Of Isosceles Triangle
Code:
import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = (base * height) / 2;

        System.out.println("Area of Isosceles Triangle = " + area);
    }
}

Output:
Enter base: 12
Enter height: 6
Area of Isosceles Triangle = 36.0

Question-5:Area Of Parallelogram
Code:
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = base * height;

        System.out.println("Area of Parallelogram = " + area);
    }
}

Output:
Enter base: 10
Enter height: 8
Area of Parallelogram = 80.0

Question-6:Area Of Rhombus
Code:
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second diagonal: ");
        double d2 = sc.nextDouble();

        double area = (d1 * d2) / 2;

        System.out.println("Area of Rhombus = " + area);
    }
}

Output:
Enter first diagonal: 10
Enter second diagonal: 8
Area of Rhombus = 40.0

Question-7:Area Of Equilateral Triangle
Code:
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Area of Equilateral Triangle = " + area);
    }
}

Output:
Enter side: 6
Area of Equilateral Triangle = 15.588457268119894

Question-8:Perimeter Of Circle
Code:
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter of Circle = " + perimeter);
    }
}

Output:
Enter radius: 7
Perimeter of Circle = 43.982297150257104

Question-9:Perimeter Of Equilateral Triangle
Code:
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double perimeter = 3 * side;

        System.out.println("Perimeter of Equilateral Triangle = " + perimeter);
    }
}

Output:
Enter side: 8
Perimeter of Equilateral Triangle = 24.0

Question-10:Perimeter Of Parallelogram
Code:
import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        double perimeter = 2 * (base + side);

        System.out.println("Perimeter of Parallelogram = " + perimeter);
    }
}
Output:
Enter base: 10
Enter side: 8
Perimeter of Parallelogram = 36.0
