package com.MyLeetCode;

import java.awt.print.PrinterGraphics;
import java.util.HashMap;

public class twoSum_1 {

    //    给定一个整数数组 nums 和一个目标值 target，
    //    请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

    public int[] twoSum1(int[] nums, int target) {
        //两次循环暴力解法
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No target matches!");
    }

    public int[] twoSum2(int[] nums, int target) {
        //HashMap用空间换时间
        //键是数组的值，值是数组下标，因为我们要求的是数组下标
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int j = map.get(target - nums[i]);
                return new int[]{j, i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No target matches!");
    }

    //双指针法见twoSum2
}
