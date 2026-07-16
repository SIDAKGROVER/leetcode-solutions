class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(open==0)open++;
            else if(ch=='('){
                if(open>0)sb.append(ch);
                open++;
            }
            else if(ch==')'){
                 open--;
                 if(open>0)sb.append(ch);
               
            }
        }
        return sb.toString();
    }
}