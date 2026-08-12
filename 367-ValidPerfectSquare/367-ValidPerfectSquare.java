// Last updated: 8/12/2026, 11:36:04 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        
        long beg = 1, end = num;
        while(beg <= end){
            long mid = beg + (end - beg)/2;
            if(mid*mid == num) return true;
            else if(mid*mid > num) end = mid - 1;
            else beg = mid + 1;
        }
        return false;
    }
}