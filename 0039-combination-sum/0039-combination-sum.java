class Solution {
    public void func(int[] nums,int idx,int target,List<List<Integer>>ans,List<Integer>curr){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(idx==nums.length || target<0)return;
        curr.add(nums[idx]);
        func(nums,idx,target-nums[idx],ans,curr);
        curr.remove(curr.size()-1);
        func(nums,idx+1,target,ans,curr);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        func(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }
}