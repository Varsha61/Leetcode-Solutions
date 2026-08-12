// Last updated: 8/12/2026, 11:40:23 AM
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right =height.length-1;
        int maxWater =0;
        while (left < right){
            int width =right-left;
            int h=Math.min(height[left],height[right]);
            int Water =width*h;
            maxWater =Math.max(maxWater,Water);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
        
    }
}