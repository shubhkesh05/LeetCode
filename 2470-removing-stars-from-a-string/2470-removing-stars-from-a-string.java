class Solution {
    public String removeStars(String s) {
        ArrayDeque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}