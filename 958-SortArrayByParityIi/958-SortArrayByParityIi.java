// Last updated: 8/12/2026, 11:34:30 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];

        int even = 0;
        int odd = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                ans[even] = num;
                even += 2;
            } else {
                ans[odd] = num;
                odd += 2;
            }
        }

        return ans;
    }
}