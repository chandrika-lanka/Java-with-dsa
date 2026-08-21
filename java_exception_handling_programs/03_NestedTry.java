public class _03_NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try");
            try {
                int x = 10 / 0;
                System.out.println(x);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
