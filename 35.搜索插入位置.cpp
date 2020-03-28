#include <iostream>
using namespace std;
int searchInsert(int nums[], int target, int len)
{
	int left = 0, right = len - 1;
	int mid = (left + right) / 2;
	while (left <= right)
	{
		if (nums[mid] == target)
			return mid;
		else if (nums[mid] > target)
		{
			right = mid - 1;
			mid = (left + right) / 2;
		}
		else
		{
			left = mid + 1;
			mid = (left + right) / 2;
		}
	}
    if(nums[1]>target)
        return 0;
	return mid + 1;
}