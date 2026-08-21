class Solution {
    public int numWays(String s) {

        final long MOD = 1000000007L;

        int ones = 0;

        // Count total number of 1s
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        // If total 1s cannot be divided equally
        if (ones % 3 != 0) {
            return 0;
        }

        // No 1s: choose any 2 split positions
        if (ones == 0) {
            long n = s.length();

            return (int) ((n - 1) * (n - 2) / 2 % MOD);
        }

        int onesPerPart = ones / 3;

        long firstGap = 0;
        long secondGap = 0;

        int count = 0;

        // Find the gap after the 1st group of ones
        // and after the 2nd group of ones.
        for (char c : s.toCharArray()) {

            if (c == '1') {
                count++;
            }

            if (count == onesPerPart) {
                firstGap++;
            }

            if (count == 2 * onesPerPart) {
                secondGap++;
            }
        }

        return (int) ((firstGap * secondGap) % MOD);
    }
}