// Last updated: 8/12/2026, 11:37:31 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k%=n;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
        
    }
    void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}