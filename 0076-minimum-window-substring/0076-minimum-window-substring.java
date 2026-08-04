class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int nt=t.length();
        int minlen=Integer.MAX_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>target=new HashMap<>();
        for(int i=0;i<nt;i++){
            char ch=t.charAt(i);
            target.put(ch,target.getOrDefault(ch,0)+1);
        }
        int have=0;
        int left=0;
        int start=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(target.containsKey(ch) && target.get(ch).intValue()==map.get(ch).intValue()){
                have++;
            }
            while(target.size()==have){
                if((i-left+1)<minlen){
                    minlen=i-left+1;
                    start=left;
                }
                char chh=s.charAt(left);
                map.put(chh,(map.get(chh)-1));
                
                if(target.containsKey(chh) && target.get(chh).intValue()>map.get(chh).intValue()){
                    have--;
                }
                
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}