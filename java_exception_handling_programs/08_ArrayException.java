public class _08_ArrayException {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}
