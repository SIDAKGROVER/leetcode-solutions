class Solution {
    public void func(int[] nums,int idx,int target,List<List<Integer>>ans,List<Integer>curr){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            if(idx<i && nums[i]==nums[i-1])continue;
            if (nums[i] > target)break;

            curr.add(nums[i]);
            func(nums,i+1,target-nums[i],ans,curr);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        func(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }
}