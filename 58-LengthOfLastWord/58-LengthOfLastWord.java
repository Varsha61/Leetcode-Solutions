// Last updated: 8/12/2026, 11:39:22 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.length();
        int spaceNo=s.lastIndexOf(' ') + 1;
        String last = s.substring(spaceNo,n);
        return last.length() ;
    }
}