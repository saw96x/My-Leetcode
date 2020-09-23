package com.MyLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Saw96x
 * @date 2020/9/17 - 17:27
 */
public class containsDuplicate_217 {
    //给定一个整数数组，判断是否存在重复元素。
    //
    //如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false


    //暴力解法(超时！）
    public boolean containsDuplicate1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    //排序
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    //哈希表
    public boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}
