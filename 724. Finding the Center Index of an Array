#include <vector>
using namespace std;
class Solution
{
public:
    int pivotIndex(vector<int> &nums)
    {
        int sum = 0, left = 0;
        for (int i = 0; i < nums.size(); i++)
            sum += nums[i];
        for (int i = 0; i < nums.size(); i++)
        {
            if (sum - nums[i] == left * 2)
                return i;
            left += nums[i];
        }
    }
};
