// Last updated: 8/12/2026, 11:37:32 AM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];

        
    }
}