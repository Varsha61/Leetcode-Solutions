// Last updated: 8/12/2026, 11:34:27 AM
class Solution {
    public int fib(int n) {
        if (n<=1) return n;
        int x=0;
        int y=1;
        int z=0;
        for(int i=2;i<=n;i++){
            z=x+y;
            x=y;
            y=z;
        }
        return z;
    }
}