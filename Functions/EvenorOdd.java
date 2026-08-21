import java.util.Scanner;

class Main {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}