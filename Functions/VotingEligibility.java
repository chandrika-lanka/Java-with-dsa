import java.util.Scanner;

class Main {

    static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (isEligible(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        sc.close();
    }
}