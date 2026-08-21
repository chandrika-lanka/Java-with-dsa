class Solution {
    public boolean isNumber(String s) {

        boolean digitSeen = false;
        boolean digitAfterE = true;
        boolean eSeen = false;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Digit
            if (Character.isDigit(c)) {

                digitSeen = true;

                if (eSeen) {
                    digitAfterE = true;
                }

            }
            // Sign
            else if (c == '+' || c == '-') {

                // Sign is valid only at the beginning
                // or immediately after e/E
                if (i != 0 &&
                    s.charAt(i - 1) != 'e' &&
                    s.charAt(i - 1) != 'E') {

                    return false;
                }
            }
            // Decimal point
            else if (c == '.') {

                // Dot is not allowed after e/E
                if (eSeen) {
                    return false;
                }

                // Only one decimal point allowed
                if (s.indexOf('.', i + 1) != -1) {
                    return false;
                }
            }
            // Exponent
            else if (c == 'e' || c == 'E') {

                // Only one exponent
                if (eSeen) {
                    return false;
                }

                // Number must exist before exponent
                if (!digitSeen) {
                    return false;
                }

                eSeen = true;
                digitAfterE = false;
            }
            // Anything else
            else {
                return false;
            }
        }

        return digitSeen && digitAfterE;
    }
}