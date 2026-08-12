// Last updated: 8/12/2026, 11:35:54 AM
class Solution {
    public char findTheDifference(String s, String t) {

        char result = 0;

        for(char c : s.toCharArray()) {
            result ^= c;
        }

        for(char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
}