class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            arr[i]=nums[i%(nums.length)];
        }
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty()&& st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty())ans[i]=-1;
            else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);

        }
        int[] finalans = Arrays.copyOf(ans, nums.length);
        return finalans;
    }
}