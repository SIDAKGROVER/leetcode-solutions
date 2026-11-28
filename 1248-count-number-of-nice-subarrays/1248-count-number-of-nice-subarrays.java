class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            if(num%2!=0)count++;
            if(map.containsKey(count-k)){
                res+=map.get(count-k);
            }
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return res;
    }
}