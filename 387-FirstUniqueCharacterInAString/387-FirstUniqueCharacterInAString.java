// Last updated: 8/12/2026, 11:35:58 AM
public class Solution { 
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i; 
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        Solution solution = new Solution(); 
        System.out.println(solution.firstUniqChar("leetcode"));    
        System.out.println(solution.firstUniqChar("loveleetcode"));  
        System.out.println(solution.firstUniqChar("aabb"));         
    }
}
