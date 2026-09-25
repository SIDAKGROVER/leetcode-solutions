class Solution {
    public boolean Palindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
    public void func(String s,int idx,List<String>curr,List<List<String>>ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(Palindrome(s,idx,i)){
                String part=s.substring(idx,i+1);
                curr.add(part);
                func(s,i+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        func(s,0,new ArrayList<>(),ans);
        return ans;
    }
}