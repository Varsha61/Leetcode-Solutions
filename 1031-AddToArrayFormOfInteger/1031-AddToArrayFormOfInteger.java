// Last updated: 8/12/2026, 11:34:16 AM
import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> result = new ArrayList<>();
        
        int i = num.length - 1;
        while(i >= 0 || k > 0) {
            if(i >= 0) {
                k = k + num[i];
            }
            result.add(k % 10);
            k = k / 10;
            
            i--;
        }
        Collections.reverse(result);
        
        return result;
    }
}