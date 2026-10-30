class Solution {
    public int strStr(String s, String p) {
        int n=s.length();
        int m=p.length();

        for(int i=0;i<=n-m;i++){
            if(s.substring(i,i+m).equals(p))return i;
        }
        return -1;
    }
    
}