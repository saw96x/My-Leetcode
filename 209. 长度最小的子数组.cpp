#include<vector>
using namespace std;
class Solution
{
public:
    int minSubArrayLen(int s, vector<int> &nums)
    {
        int front = 0, back = 0, sum = 0, len = INT_MAX;
        while (back < nums.size())
            if (sum + nums[back] < s)
            {
                sum += nums[back];
                back++;
            }
            else
            {
                if (len > back - front + 1)
                    len = back - front + 1;
                sum -= nums[front];
                front++;
            }
        return len == INT_MAX ? 0 : len;
    }
};