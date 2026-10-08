class Solution {
    int n;
    public int func(int[] arr,int i,int k,int[] dp){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int result=0;
        int curr_max=-1;
        for(int j=i;j<n && j-i+1<=k;j++){
            curr_max=Math.max(curr_max,arr[j]);
            result=Math.max(result,curr_max*(j-i+1) + func(arr,j+1,k,dp));
        }
        return dp[i]=result;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return func(arr,0,k,dp);
    }
}