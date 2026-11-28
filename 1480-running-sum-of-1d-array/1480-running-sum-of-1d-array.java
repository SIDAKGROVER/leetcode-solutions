class Solution {
    public int[] runningSum(int[] nums) {
        int prefixSum=nums[0];
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum+=nums[i];
            arr[i]=prefixSum;
        }
        return arr;
    }
}