package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/22 - 8:05
 */
public class sortArray_912 {
    //给你一个整数数组 nums，请你将该数组升序排列。


    //选择排序
    public int[] sortArray1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }
            swap(nums, minIndex, i);
        }
        return nums;
    }

    //插入排序
    public int[] sortArray2(int[] nums) {
        int len = nums.length;
        // 循环不变量：将 nums[i] 插入到区间 [0, i) 使之成为有序数组
        for (int i = 1; i < len; i++) {
            // 先暂存这个元素，然后之前元素逐个后移，留出空位
            int temp = nums[i];
            int j = i;
            // 注意边界 j > 0
            while (j > 0 && nums[j - 1] > temp) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = temp;
        }
        return nums;
    }
    public void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
