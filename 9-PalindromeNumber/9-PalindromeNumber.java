// Last updated: 8/12/2026, 11:40:27 AM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int reverseNum=0;
        while(num>0){
            reverseNum=reverseNum*10+num%10;
            num=num/10;
        }
        return reverseNum==x;
        
    }
}