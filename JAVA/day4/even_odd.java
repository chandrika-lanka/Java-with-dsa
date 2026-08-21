import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        even_odd(num);

    }

    static void even_odd(int num) {

        if (num % 2 == 0) {
            System.out.println("It is a EVEN number");

        }
        else {
            System.out.println("It is a ODD number");
        }
    }
}
