import java.util.*;

class Solution {

    public String makeLargestSpecial(String s) {

        List<String> specialStrings = new ArrayList<>();

        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                count++;
            } else {
                count--;
            }

            // Found a complete special substring
            if (count == 0) {

                // Remove the outer '1' and '0'
                String inner = s.substring(start + 1, i);

                // Recursively make the inside largest
                String largestInner = makeLargestSpecial(inner);

                // Add the outer '1' and '0' back
                String special = "1" + largestInner + "0";

                specialStrings.add(special);

                start = i + 1;
            }
        }

        // Sort in descending lexicographical order
        Collections.sort(specialStrings, Collections.reverseOrder());

        // Combine all special substrings
        StringBuilder result = new StringBuilder();

        for (String str : specialStrings) {
            result.append(str);
        }

        return result.toString();
    }
}