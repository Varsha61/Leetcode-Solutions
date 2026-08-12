// Last updated: 8/12/2026, 11:33:58 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i != mat.length-1-i){
                sum+= mat[i][mat.length-i-1]
;            }

        }
return sum;

        
    }
}