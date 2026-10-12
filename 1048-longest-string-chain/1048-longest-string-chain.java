class Solution {
    int n;
    int[][] dp;
    public int func(String[] words,int prev,int i){
        if(i>=n){
            return 0;
        }
        int p=prev+1;
        if(dp[i][p]!=-1)return dp[i][p];
        int skip=func(words,prev,i+1);
        int take=0;
        if(prev==-1 || ispredecessor(words[prev],words[i])){
            take=1+func(words,i,i+1);
        }
        return dp[i][p]=Math.max(take,skip);
    }
    public boolean ispredecessor(String prev,String curr){
        int m=prev.length();
        int n=curr.length();

        if((n-m)!=1)return false;
        int i=0,j=0;
        while(i<m  && j<n){
            if(prev.charAt(i)==curr.charAt(j))i++;
            j++;
        }
        return i==m;
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        n=words.length;
        dp=new int[n][n+1];
        for (int i = 0; i < words.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return func(words,-1,0);
    }
    
}