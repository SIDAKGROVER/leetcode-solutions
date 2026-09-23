class Solution {
    public int func(int n,int k){
        if(n==1 && k==1)return 0;
        int len=(int)Math.pow(2,n-1);
        int mid=len/2;

        if(k<=mid){
            return func(n-1,k);
        }
        else{
            return 1-func(n-1,k-mid);
        }
    }

    public int kthGrammar(int n, int k) {
       return func(n,k);
    }
}