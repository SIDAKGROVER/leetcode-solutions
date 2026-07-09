class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        //if intervier asked to print also
        // int start = 0;
        // int end = 0;
        // int tempStart = 0;
        for(int i=0;i<n;i++){
            // if(sum==0)tempStart=i;
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                // start=tempStart;
                // end=i;
            }
            if(sum<0)sum=0;

        }
        // for (int i = start; i <= end; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        if(maxi==Integer.MIN_VALUE)return 0;
        return maxi;
    }
}