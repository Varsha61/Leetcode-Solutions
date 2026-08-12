// Last updated: 8/12/2026, 11:33:43 AM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int ans = 0;

        for (String word : words1) {
            int c1 = 0, c2 = 0;

            for (String w : words1)
                if (word.equals(w)) c1++;

            for (String w : words2)
                if (word.equals(w)) c2++;

            if (c1 == 1 && c2 == 1)
                ans++;
        }

        return ans;
    }
}