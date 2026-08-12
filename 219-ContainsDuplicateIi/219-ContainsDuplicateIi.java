// Last updated: 8/12/2026, 11:36:57 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;

        
    }
}