class Solution {
    public void func(int[] candidates, int k,List<Integer>curr,List<List<Integer>>ans,int i){
        if(k==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(k<0)return;
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]){
                continue;
            }
            if(candidates[j]>k)break;
        
            curr.add(candidates[j]);
            func(candidates,k-candidates[j],curr,ans,j+1);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>>ans=new ArrayList<>();
         Arrays.sort(candidates);
        func(candidates,target,new ArrayList(),ans,0);
        return ans;
    }
}