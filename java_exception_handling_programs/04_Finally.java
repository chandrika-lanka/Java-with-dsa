public class _04_Finally {
    public static void main(String[] args) {
        try {
            int x = 10 / 2;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}
