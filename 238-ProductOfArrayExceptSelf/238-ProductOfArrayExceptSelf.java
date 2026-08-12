// Last updated: 8/12/2026, 11:36:52 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numsLength =nums.length;
        int prefixProduct =1;
        int suffixProduct =1;
        int[] result = new int[numsLength];
        for(int i=0;i<numsLength; i++){
            result[i]=prefixProduct;
            prefixProduct *= nums[i];

        }
        for(int i=numsLength-1;i>=0;i--){
            result[i] *= suffixProduct;
            suffixProduct *=nums[i];
        }
        return result;

        
    }
}