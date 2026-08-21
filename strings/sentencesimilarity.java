class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        // Make words1 the shorter sentence
        if (words1.length > words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int n = words1.length;
        int m = words2.length;

        // Number of matching words from the beginning
        int left = 0;

        while (left < n && words1[left].equals(words2[left])) {
            left++;
        }

        // Number of matching words from the end
        int right = 0;

        while (right < n - left &&
               words1[n - 1 - right].equals(words2[m - 1 - right])) {
            right++;
        }

        return left + right == n;
    }
}