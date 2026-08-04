class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int maxFreq=0;
        int maxlen=0;
        int j=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));
            while((i-j+1)-maxFreq>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    map.remove(s.charAt(j));
                }
                j++;
            }
            maxlen=Math.max(maxlen,(i-j+1));
        }
        return maxlen;
    }
}