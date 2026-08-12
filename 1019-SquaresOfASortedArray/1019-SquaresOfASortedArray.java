// Last updated: 8/12/2026, 11:34:19 AM
class Solution {
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}