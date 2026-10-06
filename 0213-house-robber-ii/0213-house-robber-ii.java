class Solution {
    public int func(int[] nums,int i,int end,int[] dp){
        if(i>end){
            return 0;     
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int steal=nums[i]+func(nums,i+2,end,dp);
        int skip=func(nums,i+1,end,dp);

        dp[i]= Math.max(steal,skip);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        int case1=func(nums,0,n-2,dp);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);

        int case2=func(nums,1,n-1,dp2);

        return Math.max(case1,case2);
    }
}