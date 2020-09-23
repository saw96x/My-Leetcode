package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/19 - 18:50
 */
public class findMaxConsecutiveOnes_485 {
    //给定一个二进制数组， 计算其中最大连续1的个数。


    public int findMaxConsecutiveOnes(int[] nums) {
        int thisCount = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                thisCount = 0;
            } else if (nums[i] == 1) {
                thisCount++;
            }
            if (thisCount > maxCount)
                maxCount = thisCount;
        }
        return maxCount;
    }
}
