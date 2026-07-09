class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int i=0;
        int max=0;
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char ss=s.charAt(i);
                map.put(ss,map.get(ss)-1);
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}