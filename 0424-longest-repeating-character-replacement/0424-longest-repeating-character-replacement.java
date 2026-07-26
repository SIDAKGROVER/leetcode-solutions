class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        
        int i=0;
        int maxFreq=0;
        int maxLength=0;
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq, map.get(ch)); 
            while((j-i+1)-maxFreq>k){
                char left = s.charAt(i);  
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                i++;
            }
            maxLength=Math.max(maxLength,j - i + 1);
        }
        return maxLength;
    }
}