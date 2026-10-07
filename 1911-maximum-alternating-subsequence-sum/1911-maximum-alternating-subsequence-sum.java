class Solution {
    int n;
    public long func(int[] nums,Boolean flag,int i,long[][] dp){
        if (i >= nums.length) {
            return 0;
        }

        int state;
        if(flag)state=1;
        else state=0;

        if(dp[i][state]!=-1){
            return dp[i][state];
        }

        long skip=func(nums,flag,i+1,dp);

        long val=nums[i];
        if(flag==false){
            val=-val;
        }

        long take=func(nums,!flag,i+1,dp)+val;

        dp[i][state]=Math.max(take,skip);
        return dp[i][state];

    }
    public long maxAlternatingSum(int[] nums) {
       n=nums.length;
       long[][] dp=new long[n][2];

       for(int i=0;i<n;i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
       }

       return  func(nums,true,0,dp);
    }
}