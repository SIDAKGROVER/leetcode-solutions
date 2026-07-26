class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<n){
            int m=fruits[r];
            mp.put(m,mp.getOrDefault(m,0)+1);
            while(mp.size()>2){
                mp.put(fruits[l],mp.get(fruits[l])-1);
                if(mp.get(fruits[l])==0)mp.remove(fruits[l]);
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}