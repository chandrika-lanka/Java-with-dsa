import java.util.*;

class Solution {

    public boolean parseBoolExpr(String expression) {

        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            // Ignore commas
            if (ch == ',') {
                continue;
            }

            // Normal characters
            if (ch != ')') {
                stack.push(ch);
                continue;
            }

            // We reached ')'
            boolean hasTrue = false;
            boolean hasFalse = false;

            // Get all values inside (...)
            while (stack.peek() != '(') {

                char value = stack.pop();

                if (value == 't') {
                    hasTrue = true;
                } else if (value == 'f') {
                    hasFalse = true;
                }
            }

            // Remove '('
            stack.pop();

            // Get operator
            char operator = stack.pop();

            boolean result;

            if (operator == '!') {
                // NOT has only one expression
                result = hasFalse;

            } else if (operator == '&') {
                // AND is true only if there is no false
                result = !hasFalse;

            } else {
                // OR is true if there is at least one true
                result = hasTrue;
            }

            // Push result back
            stack.push(result ? 't' : 'f');
        }

        return stack.pop() == 't';
    }
}