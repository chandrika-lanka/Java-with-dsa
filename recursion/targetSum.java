class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target , 0 , 0);
        return count; 
    }
    public void backtrack(int[] nums , int target ,int index,int sum ){

        if (index == nums.length){
            if(target == sum){
                count++;
            }
            return;
        }
        backtrack(nums, target, index+1, sum + nums[index]);

        backtrack(nums, target, index +1, sum-nums[index]);
    }
}

