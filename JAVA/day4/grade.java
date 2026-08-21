import java.util.Scanner;

public class grade {

    static void grade (int marks) {

        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Grade: AA");
                break;

            case 8:
                System.out.println("Grade: AB");
                break;

            case 7:
                System.out.println("Grade: BB");
                break;

            case 6:
                System.out.println("Grade: BC");
                break;

            case 5:
                System.out.println("Grade: CD");
                break;

            case 4:
                System.out.println("Grade: DD");
                break;

            default:
                if (marks >= 0 && marks <= 39) {
                    System.out.println("Grade: Fail");
                } else {
                    System.out.println("Invalid Marks");
                }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        grade(marks);
    }
}