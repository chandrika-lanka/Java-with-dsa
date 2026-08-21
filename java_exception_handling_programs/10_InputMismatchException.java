import java.util.Scanner;
import java.util.InputMismatchException;

public class _10_InputMismatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();
            System.out.println("You entered: " + n);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        }
    }
}
