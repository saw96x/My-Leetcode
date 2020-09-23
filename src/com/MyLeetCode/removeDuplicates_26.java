package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/7 - 8:38
 */
public class removeDuplicates_26 {
    //给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
    //
    //不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
    //
    public int removeDuplicates1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //双指针法
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow])
                nums[++slow] = nums[fast];
        }
        return slow + 1;
    }
}

