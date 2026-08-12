// Last updated: 8/12/2026, 11:36:17 AM
class Solution {
    public void reverseString(char[] s) {
        char swap;
        int n=s.length;
        for(int i=0;i<n/2;i++){
            swap=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=swap;
        }
    }
}