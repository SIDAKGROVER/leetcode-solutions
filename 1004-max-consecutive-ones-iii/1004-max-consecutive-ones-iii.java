class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zero=0;
        int maxi=0;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                zero++;
            }
            while(zero>k){
                if(nums[i]==0)zero--;
                i++;
            }
            maxi=Math.max(maxi,j-i+1);
        }
        return maxi;
    }
}