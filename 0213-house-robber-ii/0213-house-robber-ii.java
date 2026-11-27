class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
         if (n == 1) return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);

        int case1=func(nums,0,n-2,dp,n);

        int[] dp1=new int[n];
        Arrays.fill(dp,-1);
        int case2=func(nums,1,n-1,dp,n);

        return Math.max(case1,case2);
    }
    public int func(int[] nums,int i,int end,int[] dp,int n){
        if(i>end)return 0;
        if(dp[i]!=-1)return dp[i];
        int steal=nums[i]+func(nums,i+2,end,dp,n);
        int skip=func(nums,i+1,end,dp,n);
        
        return dp[i]=Math.max(steal,skip);
    }
}