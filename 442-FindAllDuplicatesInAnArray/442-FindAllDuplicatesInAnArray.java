// Last updated: 8/12/2026, 11:35:39 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int num : nums){
            if(visited.contains(num)){
                duplicates.add(num);
            }else{
                visited.add(num);
            }
        }
        return duplicates;
    }
}