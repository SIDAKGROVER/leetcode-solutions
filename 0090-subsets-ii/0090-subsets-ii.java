class Solution {
    public void func(int[] nums,int idx,List<Integer>curr,List<List<Integer>>ans){
            ans.add(new ArrayList<>(curr));
        
        for(int i=idx;i<nums.length;i++){

            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            func(nums,i+1,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        func(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}