class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s[0].length()==0)return "";
        StringBuilder st=new StringBuilder();
        int n=s[0].length();
        for(int i=0;i<n;i++){
            char ch=s[0].charAt(i);
            for(int j=1;j<s.length;j++){
                if(i==s[j].length() || ch!=s[j].charAt(i)){
                   st.append(s[0].substring(0,i));
                   return st.toString();
                }
            }
        }
        return s[0];
    }
}