public class DigitOnly {
    public static void main(String[] args) {
        String str = "123456";
        boolean isDigit = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isDigit = false;
                break;
            }
        }

        System.out.println("Digit Only = " + isDigit);
    }
}