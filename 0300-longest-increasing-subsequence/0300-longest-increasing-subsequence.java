class Solution {
    int n;

    public int func(int[] nums,int i,int prev,int[][] dp){
        if(i>=nums.length){
            return 0 ;
        }
        int p=prev+1;
        if(dp[i][p]!=-1)return dp[i][p];
        int skip=func(nums,i+1,prev,dp);
        int take=0;
        if(prev==-1 || nums[i]>nums[prev]){
            take=1+func(nums,i+1,i,dp);
        }

        dp[i][p]= Math.max(take,skip);
         return dp[i][p];
        
    }
    public int lengthOfLIS(int[] nums) {
        n=nums.length;
        int[][] dp=new int[n][n+1];

        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(nums,0,-1,dp);
    }
}