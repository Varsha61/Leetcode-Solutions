// Last updated: 8/12/2026, 11:37:24 AM
class Solution {
    public int hammingWeight(int n) {
        int count = 0 ;
        while(n != 0 ) {
            if((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}