class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length();

        boolean[] reachable = new boolean[n];
        reachable[0] = true;

        int reachableCount = 0;

        for (int i = 1; i < n; i++) {

            // Add index that just entered the valid jump window
            int add = i - minJump;

            if (add >= 0 && reachable[add]) {
                reachableCount++;
            }

            // Remove index that is now outside the window
            int remove = i - maxJump - 1;

            if (remove >= 0 && reachable[remove]) {
                reachableCount--;
            }

            // Current index is reachable if:
            // 1. It is '0'
            // 2. There is at least one reachable index
            //    within [i-maxJump, i-minJump]
            if (s.charAt(i) == '0' && reachableCount > 0) {
                reachable[i] = true;
            }
        }

        return reachable[n - 1];
    }
}