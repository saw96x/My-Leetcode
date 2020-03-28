#include <vector>
#include <algorithm>
using namespace std;
class Solution1
{
public:
    void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)//泛型算法
    {
        nums1.erase(nums1.begin() + m, nums1.end());
        for (int i = 0; i < n; i++)
            nums1.push_back(nums2[i]);
        sort(nums1.begin(), nums1.end());
    }
};
class Solution2
{
public:
    void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)//尾部双指针
    {
        int tail = m + n - 1, tail1 = m - 1, tail2 = n - 1;
        while (tail != tail1)
            if (tail1 >= 0 && nums1[tail1] > nums2[tail2])
                nums1[tail--] = nums1[tail1--];
            else
                nums1[tail--] = nums2[tail2--];
    }
};