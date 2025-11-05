class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<n;i++){
            if(st.isEmpty() && s.charAt(i) == '*'){
                continue;
            }
            else if(!st.isEmpty() && s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sol = new StringBuilder();
        while(!st.isEmpty()){
            sol.append(st.pop());
        }
        sol.reverse();
        return sol.toString();
    }
}