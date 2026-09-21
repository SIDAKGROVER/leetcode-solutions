class Solution {
    public void func(int idx,int k,List<Integer>curr,List<List<Integer>>ans,int n){
        if(n==0 && k==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(k==0)return;
        
        for(int i=idx;i<=9;i++){
            if(i>n)break;
            curr.add(i);
            func(i+1,k-1,curr,ans,n-i);
            curr.remove(curr.size()-1);
            

        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        func(1,k,new ArrayList<>(),ans,n);
        return ans;
    }
}