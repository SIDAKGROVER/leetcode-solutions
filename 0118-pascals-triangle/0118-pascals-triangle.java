class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        if(n==0)return ans;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        if(n==1)return ans;
        for(int i=1;i<n;i++){
            List<Integer>prevRow=ans.get(i-1);
            List<Integer>curr=new ArrayList<>();
            curr.add(1);
            for (int j = 0; j < i - 1; j++) {
                curr.add(prevRow.get(j) + prevRow.get(j + 1));
            }  
            curr.add(1);
            ans.add(new ArrayList<>(curr));
        }
    return ans;
    }
}