class Solution {
    public int maxProfit(int[] arr) {
        int Min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min)Min=arr[i];
            else{
                profit=Math.max(profit,arr[i]-Min);
            }
        }
        return profit;
    }
}