// Last updated: 8/12/2026, 11:36:09 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> out=new HashSet<Integer>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n1: nums2){
            if(set1.contains(n1)){
                out.add(n1);
            }
        }
        int arr[]=new int[out.size()];
        int i=0;
        for(int n: out){
            arr[i++]=n;
        }
        return arr;
    }
}