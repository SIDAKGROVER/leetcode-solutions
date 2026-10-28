class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int coll=target-nums[i];
            if(map.containsKey(coll)){
                return new int[] {i,map.get(coll)};

            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}