class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n=arr.length;
        int curr=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                curr++;
            }
            else{
                max=Math.max(max,curr);
                curr=0;
            }
        }
        max = Math.max(max, curr);
        return max;
    }
}