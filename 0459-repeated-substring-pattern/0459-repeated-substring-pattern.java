class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return solve(s,1);
    }
    public boolean solve(String s,int n){
        if(n>(s.length()/2)){
            return false;
        }
        if(s.length()%n==0){
            String sub=s.substring(0,n);
            StringBuilder st=new StringBuilder();
            while(st.length()<s.length()){
                st.append(sub);
            }
            if(st.toString().equals(s))return true;
        }
        return solve(s,n+1);
    }
}