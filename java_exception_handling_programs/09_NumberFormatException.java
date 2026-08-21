public class _09_NumberFormatException {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt("ABC");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
