class Solution {
    public void func(int open,int close,int n,List<String>ans,String curr){
        if(close>open || open>n){
            return;
        }
        if(close==open && open==n){
            ans.add(curr);
            return;
        }
        func(open+1,close,n,ans,curr+"(");
        func(open,close+1,n,ans,curr+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        func(0,0,n,ans,"");
        return ans;
    }
}