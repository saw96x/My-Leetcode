package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/15 - 8:04
 */
public class rotate_189 {
    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

    //使用额外的数组
    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        int[] neo = new int[len];
        for (int i = 0; i < len; i++) {
            neo[(i + k) % len] = nums[i];
        }
        System.arraycopy(neo, 0, nums, 0, len);
    }

    //整体反转
    public void rotate2(int[] nums, int k) {
        k%=nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
