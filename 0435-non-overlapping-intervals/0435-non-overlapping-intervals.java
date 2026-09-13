class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int n=intervals.length;
        int count=0;
        int lastEnd=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(lastEnd<=intervals[i][0]){
                count++;
                lastEnd=intervals[i][1];

            }

        }
        return n-count;
    }
}