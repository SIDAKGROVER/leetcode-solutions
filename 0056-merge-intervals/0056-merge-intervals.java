class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        ArrayList<int[]> ans = new ArrayList<>();

        int n=intervals.length;
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<n;i++){
            if(e>=intervals[i][0]){
                e=Math.max(e,intervals[i][1]);
            }
            else{
                ans.add(new int[]{s,e});

                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        ans.add(new int[]{s, e});
        return ans.toArray(new int[ans.size()][]);
    }
}