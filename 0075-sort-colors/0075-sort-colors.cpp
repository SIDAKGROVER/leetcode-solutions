class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n=nums.size();
        int zerocount=0;
        int onecount=0;
        int twocount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocount++;
            }
            if(nums[i]==1){
                onecount++;
            }
            if(nums[i]==2){
                twocount++;
            }
        }
        int index=0;
        for(int i=0;i<zerocount;i++){
           nums[index++]=0;
        }
        for(int i=0;i<onecount;i++){
            nums[index++]=1;
        }
        for(int i=0;i<twocount;i++){
            nums[index++]=2;
        }
        

    }
};