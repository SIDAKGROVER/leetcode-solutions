class Solution {
    public int maxScore(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxi=sum;

        for(int i=0;i<k;i++){
            sum=sum-nums[k-i-1]+nums[n-i-1];
            maxi=Math.max(sum,maxi);
        }
        return maxi;
    }
    
}