class Solution {
    int n;
    public ArrayList getPrevSmaller(int[] nums) {
        n=nums.length;
        ArrayList<Integer>arr=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(st.isEmpty())arr.add(-1);
            else{
                arr.add(st.peek());
            }
            st.push(i);
        }
        return arr;
    }
    public ArrayList getNextSmaller(int[] nums) {
        n=nums.length;
        ArrayList<Integer>arr=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty())arr.add(n);
            else{
                arr.add(st.peek());
            }
            st.push(i);
        }
        Collections.reverse(arr);
        return arr;
    }
    public int sumSubarrayMins(int[] nums) {
        n=nums.length;
        ArrayList<Integer>LSE=getPrevSmaller(nums);
        ArrayList<Integer>RSE=getNextSmaller(nums);

        long sum=0;
        long M=1000000007;
        for(int i=0;i<n;i++){
            long ls=i-LSE.get(i);
            long rs=RSE.get(i)-i;

            long totalways=ls*rs;
            long totalsum=nums[i]*totalways;
            sum=(sum+totalsum)%M;

        }
        return (int)sum;
    }
}