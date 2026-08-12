// Last updated: 8/12/2026, 11:39:50 AM
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        boolean[] isOuter = new boolean[s.length()];
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            int start = 0;
            if(ch[i]=='('){
                st.push(i);
            }else{
                if(st.isEmpty()) continue;
                start = st.pop();
                isOuter[i] = true;
                isOuter[start] = true;
            }      
        }
        int max = 0;
       int count = 0;
       System.out.print(Arrays.toString(isOuter));
        for(boolean flag:isOuter){
            if(flag){
                count++;
            }else{
                max = Math.max(max,count);
                count = 0 ;
            }
        }
        if(count>0) {
            max = Math.max(max,count);
        }
        return max;

    }
}