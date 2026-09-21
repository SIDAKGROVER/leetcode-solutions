class Solution {
    public void func(int[] candidates, int k,List<Integer>curr,List<List<Integer>>ans,int i){
        if(k==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(k<0 || i==candidates.length){
            return;
        }
        
        curr.add(candidates[i]);
        func(candidates,k-candidates[i],curr,ans,i);
        curr.remove(curr.size()-1);
        func(candidates,k,curr,ans,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        func(candidates,target,new ArrayList(),ans,0);
        return ans;
    }
}