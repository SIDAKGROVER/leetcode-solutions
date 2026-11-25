class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp,-1);
        }
        return func(n,dp);
    }
    public int func(int n,int[] dp){
        if(n==0)return 1;
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        else{
            dp[n]=func(n-1,dp)+func(n-2,dp);
        }
        return dp[n];
    }
}