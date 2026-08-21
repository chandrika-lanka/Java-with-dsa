class Solution {

    static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long part1 = power(5, evenPositions);
        long part2 = power(4, oddPositions);

        return (int)((part1 * part2) % MOD);
    }

    private long power(long base, long exponent) {

        long result = 1;

        while (exponent > 0) {

            // If exponent is odd
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }

            // Square the base
            base = (base * base) % MOD;

            // Divide exponent by 2
            exponent = exponent / 2;
        }

        return result;
    }
}