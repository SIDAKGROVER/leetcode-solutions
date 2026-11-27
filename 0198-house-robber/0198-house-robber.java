class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp,-1);
        }
        return func(nums,0,n,dp);
    }
    public int func(int[] nums,int i,int n,int[] dp){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int steal=nums[i]+func(nums,i+2,n,dp);
        int skip=func(nums,i+1,n,dp);

        return dp[i]=Math.max(steal,skip);
    }
}