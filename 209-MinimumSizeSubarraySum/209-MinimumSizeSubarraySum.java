// Last updated: 8/12/2026, 11:37:05 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0,sum= 0,minLen=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            while(sum>=target)
            {
                minLen=Math.min(minLen,i - left+1);
                sum=sum - nums[left++];
            }
        }
        return (minLen == Integer.MAX_VALUE)?0:minLen;

    }
}