#include<vector>
#include<limits.h>
using namespace std;
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int ThisSum=0,MaxSum=-INT_MAX;
        if(nums.size()==1)
            return nums[0];
        for(int i=0;i<nums.size();i++){
            if(ThisSum<0)
                ThisSum=0;
            ThisSum+=nums[i];
            if(ThisSum>MaxSum)
                MaxSum=ThisSum;
        }
        return MaxSum;
    }
};