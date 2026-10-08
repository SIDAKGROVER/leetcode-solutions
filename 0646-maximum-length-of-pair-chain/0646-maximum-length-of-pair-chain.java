class Solution {
    int n;
    public int findLongestChain(int[][] pairs){
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        n=pairs.length;
        int[][] dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return func(pairs, 0, -1,dp);

    }

    public int func(int[][] pairs,int i,int prev,int[][] dp){
        if(i==n){
            return 0;
        }
        int p=prev+1;
        if(dp[i][p]!=-1)return dp[i][p];

        int skip=func(pairs,i+1,prev,dp);
        int take=0;
        if(prev==-1 || pairs[i][0] >pairs[prev][1]){
            take=1+func(pairs,i+1,i,dp);
        }
        return dp[i][p]=Math.max(skip,take);
    }
}