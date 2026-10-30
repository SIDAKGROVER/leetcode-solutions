import java .util.*;
class NumArray {
    ArrayList<Integer>ans;
    public NumArray(int[] nums) {
        ans=new ArrayList<>();
        for(int num:nums){
            ans.add(num);
        }
    }
    
    public int sumRange(int l, int r) {
        int sum=0;
        while(l<=r){
            sum+=ans.get(l);
            l++;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */