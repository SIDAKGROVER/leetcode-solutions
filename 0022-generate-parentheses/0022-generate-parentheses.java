class Solution {

    public void func(int n,int open,int close,String s,List<String>ans){
        if(close>open || open>n){
            return;
        }
        if(open==close && open==n){
            ans.add(s);
            return;
        }
        func(n,open+1,close,s+"(",ans);
        func(n,open,close+1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        func(n,0,0,"",ans);
        return ans;

    }
}