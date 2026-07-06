class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==0){
            return;
        }
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);

    }
    public void swap(int[] nums,int s,int l){
        while(s<l){
            int temp=nums[s];
            nums[s]=nums[l];
            nums[l]=temp;
            s++;
            l--;
        }
    }
}