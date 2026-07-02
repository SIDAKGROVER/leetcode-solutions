class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        double min=Integer.MAX_VALUE;
        while(i<j){
            double av=(nums[i]+nums[j])*0.5;
            if(av<min)min=av;
           i++;
           j--; 
        }
        return min;
    }
}