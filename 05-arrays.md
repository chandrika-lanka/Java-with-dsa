Q1-Build Array from Permutation
import java.util.Arrays;

public class BuildArrayFromPermutation {

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
Output-
[0, 1, 2, 4, 5, 3]

Q2-Concatenation of Array
import java.util.Arrays;

public class ConcatenationArray {

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
Output-
[1, 2, 1, 1, 2, 1]

Q3-Running Sum of 1d Array
import java.util.Arrays;

public class RunningSum {

    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
Output-
[1, 3, 6, 10]

Q4-Richest Customer Wealth
public class RichestCustomerWealth {

    static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] customer : accounts) {
            int sum = 0;

            for (int money : customer) {
                sum += money;
            }

            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        System.out.println(maximumWealth(accounts));
    }
}
Output-6

Q5-Shuffle the Array
import java.util.Arrays;

public class ShuffleArray {

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
Output-
[2, 3, 5, 4, 1, 7]
