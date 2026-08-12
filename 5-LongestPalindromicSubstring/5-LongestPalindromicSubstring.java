// Last updated: 8/12/2026, 11:40:35 AM
class Solution {
    public boolean isPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String longPalin="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String substr=s.substring(i,j);
                if(isPalin(substr)){
                    if(longPalin.length() < substr.length()){
                        longPalin=substr;
                    }
                }
            }
        }
        return longPalin;
    }
}