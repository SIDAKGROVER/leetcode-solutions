class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String>ans=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        int l=0;
        for(int r=0;r<s.length();r++){
            if(r-l+1==10){
                String str=s.substring(l,r+1);;
                 map.put(str,map.getOrDefault(str,0)+1);
                 l++;
            }
        }
       for (String key : map.keySet()) {
            if(map.get(key)>1)ans.add(key);
        }
        return ans;
    }
}