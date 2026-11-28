class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxfreq=0;
        int maxlen=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            if(maxfreq<map.get(ch)){
                maxfreq=map.get(ch);
            }
            while((j-i+1)-maxfreq>k){
                char cc=s.charAt(i);
                map.put(cc,map.get(cc)-1);
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}