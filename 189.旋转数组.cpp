#include <vector>
#include <algorithm>
using namespace std;
class Solution1
{
public:
    void rotate(vector<int> &nums, int k)
    {
        reverse(nums.begin(), nums.end() - k % nums.size());
        reverse(nums.end() - k % nums.size(), nums.end());
        reverse(nums.begin(), nums.end());
    }
};

class Solution2
{
public:
    void rotate(vector<int> &nums, int k)//暴力算法，无法ac，经供参考
    {
        int j, i = 0;
        for (i = 0; i < k; i++)
            for (j = nums.size() - 1; j > 0; j--)
                swap(nums[j], nums[j - 1]);
    }
};