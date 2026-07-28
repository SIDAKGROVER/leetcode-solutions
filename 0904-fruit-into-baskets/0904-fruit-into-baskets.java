class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=fruits.length;
        int length=0;
        int l=0;
        int r=0;
        while(r<n){
            int m=fruits[r];
            mp.put(m,mp.getOrDefault(m,0)+1);
            while(mp.size()>2){
                int left=fruits[l];
                mp.put(left,mp.get(left)-1);
                if(mp.get(left)==0){
                    mp.remove(left);
                }
                l++;
            }
            
            length=Math.max((r-l+1),length);
            r++;
        }
        return length;
    }
}