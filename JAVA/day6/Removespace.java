public class Removespace {
    public static void main(String[] args) {
        String str = "  Hello   World  ";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("Result = " + result);
    }
}