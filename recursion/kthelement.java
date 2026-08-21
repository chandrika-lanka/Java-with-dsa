class Solution {

    public char findKthBit(int n, int k) {

        // Base case
        if (n == 1) {
            return '0';
        }

        // Length of S(n-1)
        int len = (1 << (n - 1)) - 1;

        // Middle position
        int middle = len + 1;

        // Case 1: Left half
        if (k < middle) {
            return findKthBit(n - 1, k);
        }

        // Case 2: Middle
        if (k == middle) {
            return '1';
        }

        // Case 3: Right half
        int mirrorPosition = len - (k - middle) + 1;

        char result = findKthBit(n - 1, mirrorPosition);

        // Invert the result
        if (result == '0') {
            return '1';
        } else {
            return '0';
        }
    }
}