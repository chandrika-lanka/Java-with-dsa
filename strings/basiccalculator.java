import java.util.*;

class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();

        int result = 0;
        int num = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Build number
            if (c >= '0' && c <= '9') {

                num = num * 10 + (c - '0');
            }

            // Positive number / expression
            else if (c == '+') {

                result += sign * num;

                num = 0;
                sign = 1;
            }

            // Negative number / expression
            else if (c == '-') {

                result += sign * num;

                num = 0;
                sign = -1;
            }

            // Start of parentheses
            else if (c == '(') {

                // Save current result
                stack.push(result);

                // Save current sign
                stack.push(sign);

                // Reset for expression inside parentheses
                result = 0;
                sign = 1;
            }

            // End of parentheses
            else if (c == ')') {

                // Add the last number inside parentheses
                result += sign * num;

                num = 0;

                // Sign before '('
                int previousSign = stack.pop();

                // Result before '('
                int previousResult = stack.pop();

                result = previousResult + previousSign * result;
            }

            // Ignore spaces
        }

        // Add final number
        result += sign * num;

        return result;
    }
}