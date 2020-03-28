#include<vector>
#include<limits.h>
using namespace std;
class Solution {//转化未最大子列和的动态规划问题
public:
    int maxSubArray(vector<int>& nums,int right) {
        int ThisSum=0,MaxSum=-INT_MAX;
        for(int i=0;i<right;i++){
            if(ThisSum<0)
                ThisSum=0;
            ThisSum+=nums[i];
            if(ThisSum>MaxSum)
                MaxSum=ThisSum;
        }
        return MaxSum;
    }
    int maxProfit(vector<int>& prices) {
        if(prices.size()<=1)
            return 0;
        for(int i=0;i<prices.size()-1;i++){
            prices[i]=prices[i+1]-prices[i];
        }
        return (maxSubArray(prices,prices.size()-1))>0?maxSubArray(prices,prices.size()-1):0;
    }
};
class Solution2 {//单调栈法，不是很熟练
public:
    int maxProfit(vector<int>& prices) {
        int ans = 0;
        vector<int> St;
        prices.emplace_back(-1);
        for (int i = 0; i < prices.size(); ++ i){
            while (!St.empty() && St.back() > prices[i]){
                ans = std::max(ans, St.back() - St.front());
                St.pop_back();
            }
            St.emplace_back(prices[i]);
        }
        return ans;
    }
};