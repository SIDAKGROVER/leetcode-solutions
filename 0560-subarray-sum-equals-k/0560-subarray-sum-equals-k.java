class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int res=0;
        int prefSum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefSum+=arr[i];

            int rem=prefSum-k;
            if(map.containsKey(rem)){
                res+=map.get(rem);
            }

            map.put(prefSum,map.getOrDefault(prefSum,0)+1);
        }
    return res;

    }
}