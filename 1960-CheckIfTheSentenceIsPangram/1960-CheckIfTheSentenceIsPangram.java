// Last updated: 8/12/2026, 11:33:57 AM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i='a';i<='z';i++ )
        {
            if(sentence.indexOf(i)==-1)
            {
                return false;
            }
        }
        return true;
        
    }
}