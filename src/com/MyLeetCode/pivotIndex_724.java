package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/21 - 8:16
 */
public class pivotIndex_724 {
    //给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
    //
    //我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
    //
    //如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - nums[i] - leftSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1, -1, -1, -1, -1, 0}));
    }
}
