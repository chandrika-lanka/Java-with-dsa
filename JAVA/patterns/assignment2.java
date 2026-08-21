public class assignment2 {
    public static void main(String[] args) {

        // Inverted pyramid
        for (int i = 5; i >= 1; i--) {

            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Normal pyramid
        for (int i = 2; i <= 5; i++) {

            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}