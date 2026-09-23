class Solution {
    public long power(long x , long n){
        long mod = 1000000007;
        if(n == 0){
            return 1;
        }
        long half = power(x , n/2);

        if(n%2 == 0){
            return (half*half)%mod;
        }
        else{
            return (x*half*half)%mod;
        }
    }
    public int countGoodNumbers(long n) {
         long mod = 1000000007;
        long evenIdx=(n+1)/2;
        long oddIdx=n/2;

        return (int)(power(5, evenIdx)*power(4,oddIdx)%mod);
    }
}