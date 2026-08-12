// Last updated: 8/12/2026, 11:39:47 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int flag=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=i;
                return flag;
            }else{
                if(nums[i]>=target){
                    flag=i;
                    return flag;
                }
            }
        }
        return nums.length;
    }
}