package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/9 - 7:50
 */
public class searchInsert_35 {
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    //
    //你可以假设数组中无重复元素。
    //直接循环
    public int searchInsert1(int[] nums, int target) {
        if (nums.length == 0 || nums == null)
            return 0;
        //直接循环查找
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            else {
                if (nums[i] > target)
                    return i;
            }
        }
        return nums.length;
    }
    //二分法
    public static int searchInsert2(int[] nums, int target) {
        if (nums.length == 0 || nums == null)
            return 0;
        //二分法查找
        int left = 0, right = nums.length - 1;
        int mid = (left + right) >> 1;
        while (left <= right) {
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid]) {
                right = mid - 1;
                mid = (left + right) >> 1;
            } else {
                left = mid + 1;
                mid = (left + right) >> 1;
            }
        }
        return mid + 1;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert2(new int[]{2, 3, 5, 7}, 4));
    }
}
