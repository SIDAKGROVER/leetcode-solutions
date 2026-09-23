class Solution {
    public void func(int idx,int[] nums,List<Integer>curr,List<List<Integer>>ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        func(idx+1,nums,curr,ans);
        curr.remove(curr.size()-1);
        func(idx+1,nums,curr,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        func(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}