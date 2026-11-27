class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int r=0;
        int l=0;
        int maxi=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxi=Math.max(maxi,r-l+1);
            r++;
        }
        return maxi;
    }
}