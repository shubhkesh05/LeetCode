class Solution {
    public static void solve(int open,int close,int n,ArrayList<String> ans,String curr){
        if(open==close && open+close==n*2){
            ans.add(curr);
            return ;
        }
        if(open<n){
            solve(open+1,close,n,ans,curr+"(");
        }
        if(close<open){
            solve(open,close+1,n,ans,curr+")");
        }
    }
    public List<String> generateParenthesis(int n) {
          ArrayList<String> ans=new ArrayList<>();
        solve(0,0,n,ans,"");
        return ans;
    }
}