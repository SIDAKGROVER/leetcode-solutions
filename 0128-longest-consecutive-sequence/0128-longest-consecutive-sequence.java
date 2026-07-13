class Solution {
    int longestConsecutive(int[] nums) {
        int n=nums.length;
        if (n == 0)return 0;
        // TreeSet<Integer>set=new TreeSet<>();
        // for(int num:nums){
        //     set.add(num);
        // }
        // int max=1;
        // int count=1;
        // for(int num:set){
        //     Integer next=set.higher(num);
        //     if(next!=null && next==num+1){
        //         count++;
        //     }
        //     else{
        //         max=Math.max(count,max);
        //         count=1;
        //     }
        // }
        // return max;


        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int count=1;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}