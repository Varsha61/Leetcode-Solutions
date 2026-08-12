// Last updated: 8/12/2026, 11:35:49 AM
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; 
        int length = 0;
        
        for (char c : s.toCharArray()) {
            freq[c]++;
            if (freq[c] == 2) { // found a pair
                length += 2;
                freq[c] = 0; // reset to avoid counting again
            }
        }
        
        if (length < s.length()) { 
            length++; // one odd character can go in middle
        }
        
        return length;
    }

        
    }
