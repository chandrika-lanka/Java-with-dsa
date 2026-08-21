class Solution {
    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int count = 0;

        // Repeat until length is at least b.length()
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        // Check after minimum required repetitions
        if (sb.indexOf(b) != -1) {
            return count;
        }

        // One extra repetition may be needed
        sb.append(a);
        count++;

        if (sb.indexOf(b) != -1) {
            return count;
        }

        return -1;
    }
}