CONDITIONS:
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


LOOPS:
Question:1 Print all elements of an array.
Code:
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20};

        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
Output:
Array Elements:
10 20 30 40 50 20

Question:2 Find the sum of all elements.
Code:
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
Output:
Sum = 170

Question:3 Find the average of array elements.
Code:
public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);
    }
}
Output:
Average = 28.333333333333332

Question:4 Find the largest element.
Code:
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Element = " + largest);
    }
}
Output:
Largest Element = 50

Question:5 Find the smallest element.
Code:
public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Element = " + smallest);
    }
}
Output:
Smallest Element = 10

Question:6 Count even and odd numbers.
Code:
public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {10, 21, 30, 45, 50, 20};

        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}
Output:
Even Count = 4
Odd Count = 2

Question:7 Reverse an array.
Code:
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 20};

        System.out.println("Reversed Array:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
Output:
Reversed Array:
20 50 40 30 20 10

Question:8 Search for a given element.
Code:
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 20};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

        sc.close();
    }
}
Output:
Enter element to search: 40
Element Found

Question:9 Count the occurrence of a specific number.
Code:
import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int key = sc.nextInt();

        int count = 0;

        for (int num : arr) {
            if (num == key)
                count++;
        }

        System.out.println("Occurrence = " + count);

        sc.close();
    }
}
Output:
Enter number: 20
Occurrence = 3

Question:10 Find the second largest element.
Code:
public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 40, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Element = " + secondLargest);
    }
}
Output:
Second Largest Element = 40

Q11.Print all elements of a matrix.
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix Elements:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}                                                                                                                                                                           OUTPUT : Matrix Elements:
1 2 3
4 5 6
7 8 9                                                                                                           
Q12:Find the sum of all elements.
public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = 0;

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                sum += matrix[i][j];

        System.out.println("Sum = " + sum);
    }
}                                                                                                                      
 OUTPUT: Sum = 45                                                                                
Q13:Find the largest element.
 public class LargestElement {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int max = matrix[0][0];

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                if(matrix[i][j] > max)
                    max = matrix[i][j];

        System.out.println("Largest Element = " + max);
    }
}                                                                                                                    
OUTPUT:                                                                                                            
 Largest Element = 9                                                                               
Q14:Find the smallest element.
public class SmallestElement {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int min = matrix[0][0];

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
                if(matrix[i][j] < min)
                    min = matrix[i][j];

        System.out.println("Smallest Element = " + min);
    }
}                                                                                                                     
OUTPUT: Smallest Element = 1                                                             
Q15:Print row-wise sums.
public class RowWiseSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i=0;i<matrix.length;i++){
            int sum = 0;

            for(int j=0;j<matrix[i].length;j++)
                sum += matrix[i][j];

            System.out.println("Row " + (i+1) + " Sum = " + sum);
        }
    }
}                                                                                                                      
OUTPUT:                                                                                                
Row 1 Sum = 6
Row 2 Sum = 15
Row 3 Sum = 24                                                                                      
Q16:Print column-wise sums.
public class ColumnWiseSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int j=0;j<matrix[0].length;j++){
            int sum = 0;

            for(int i=0;i<matrix.length;i++)
                sum += matrix[i][j];

            System.out.println("Column " + (j+1) + " Sum = " + sum);
        }
    }
}                                                                                                                    
OUTPUT:                                                                                                   
 Column 1 Sum = 12
Column 2 Sum = 15
Column 3 Sum = 18                                                                                
Q17:Find the average of all elements.
 public class MatrixAverage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = 0;
        int count = 0;

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++){
                sum += matrix[i][j];
                count++;
            }

        double average = (double)sum / count;

        System.out.println("Average = " + average);
    }
}                                                                                                                   
OUTPUT:                                                                                                  
Average = 5.0                                                                                        
Q18:Count even and odd numbers.
  public class EvenOddCount {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int even = 0;
        int odd = 0;

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
    }
}                                                                                                                                
OUTPUT:                                                                                                  
 Even Count = 4
Odd Count = 5                                                                                           
Q19:Print the main diagonal.
public class MainDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.print("Main Diagonal: ");

        for(int i=0;i<matrix.length;i++)
            System.out.print(matrix[i][i] + " ");
    }
}                                                                                                                 
   OUTPUT:                                                                                              
  Main Diagonal: 1 5 9                                                                            
Q20:Print the secondary diagonal.
  public class SecondaryDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = matrix.length;

        System.out.print("Secondary Diagonal: ");

        for(int i=0;i<n;i++)
            System.out.print(matrix[i][n-1-i] + " ");
    }
}                                                                                                                         
 OUTPUT:                                                                                                    
 Secondary Diagonal: 3 5 7\
