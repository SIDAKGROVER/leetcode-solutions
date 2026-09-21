class Solution {
    public void func(int[] nums,int idx,List<Integer>curr,List<List<Integer>>ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        func(nums,idx+1,curr,ans);
        curr.remove(curr.size()-1);
        func(nums,idx+1,curr,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        func(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}