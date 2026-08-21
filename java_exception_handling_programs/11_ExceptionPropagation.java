public class _11_ExceptionPropagation {
    static void method1() {
        method2();
    }

    static void method2() {
        int x = 10 / 0;
        System.out.println(x);
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main");
        }
    }
}
