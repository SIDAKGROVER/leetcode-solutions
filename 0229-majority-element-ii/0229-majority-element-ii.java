class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int ele1=0,ele2=0;
        for(int n:nums){
            if(cnt1>0 && ele1==n){
                cnt1++;
            }
            else if(cnt2>0 && ele2==n){
                cnt2++;
            }
            else if(cnt1==0){
                cnt1=1;
                ele1=n;
            }
            else if(cnt2==0){
                cnt2=1;
                ele2=n;
            }
            else{
                cnt1--;
                cnt2--;
            }

        }
        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == ele1) cnt1++;
            else if (num == ele2) cnt2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (cnt1 > nums.length / 3) ans.add(ele1);
        if (cnt2 > nums.length / 3) ans.add(ele2);

        return ans;

    }
}