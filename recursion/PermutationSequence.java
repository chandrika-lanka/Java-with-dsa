import java.util.*;

class Solution {

    public String getPermutation(int n, int k) {

        // Store available numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Calculate factorials
        int[] factorial = new int[n + 1];
        factorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        // Convert k to 0-based index
        k--;

        StringBuilder result = new StringBuilder();

        for (int i = n; i >= 1; i--) {

            // Number of permutations starting
            // with each available number
            int blockSize = factorial[i - 1];

            // Find which block contains k
            int index = k / blockSize;

            // Select that number
            result.append(numbers.get(index));

            // Remove it so it cannot be reused
            numbers.remove(index);

            // Move to position inside that block
            k = k % blockSize;
        }

        return result.toString();
    }
}