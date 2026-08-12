// Last updated: 8/12/2026, 11:34:06 AM
import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2)) {
                return true;
            }
            if (num % 2 == 0 && set.contains(num / 2)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}