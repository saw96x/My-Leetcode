package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/18 - 10:10
 */
public class moveZeroes_283 {
    //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序

    //双指针
    public void moveZeroes(int[] nums) {
        int lastOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[lastOne++] = nums[i];
        }
        for (int i = lastOne; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    //双指针2.0
    public void moveZeroes2(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt++] = nums[cur];
                nums[cur] = temp;
            }
        }
    }
}
