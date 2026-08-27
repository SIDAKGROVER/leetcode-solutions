class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int max=0;
        int l=0;
        int r=0;

        while(r<n){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char lefthchar=s.charAt(l);
                map.put(lefthchar,map.get(lefthchar)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;

        }
        return max;
    }
}