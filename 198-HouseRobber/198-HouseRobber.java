// Last updated: 8/12/2026, 11:37:21 AM
class Solution{
    public int rob(int[] nums){
        int rob=0;
        int norob=0;
        for(int i=0;i<nums.length;i++){
            int newRob= norob + nums[i];
            int newNoRob =Math.max(norob, rob);
            rob=newRob;
            norob=newNoRob;
        }
        return Math.max(rob,norob);
    }
}