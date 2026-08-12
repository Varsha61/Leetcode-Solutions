// Last updated: 8/12/2026, 11:39:19 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // If we are here, it means all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1; // e.g., 999 -> 1000

        return result;
    }
}