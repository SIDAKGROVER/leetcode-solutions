class Solution {

    public int func(int[] nums,int i,int[] dp){
        if(i>=nums.length)return 0;


        if(dp[i]!=-1)return dp[i];
        int steal=nums[i]+func(nums,i+2,dp);
        int skip=func(nums,i+1,dp);
        dp[i]=Math.max(steal,skip);
        return dp[i];

    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return func(nums,0,dp);
    }
    
}