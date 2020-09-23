package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/21 - 8:47
 */
public class dominantIndex_747 {
    //在一个给定的数组nums中，总是存在一个最大元素 。
    //
    //查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
    //
    //如果是，则返回最大元素的索引，否则返回-1。
    public int dominantIndex(int[] nums) {
//        if (nums.length == 1)
//            return 0;
//        int maxIndex = 0, secondIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > nums[maxIndex]) {
//                secondIndex = maxIndex;
//                maxIndex = i;
//            }
//        }
//        if (nums[maxIndex] >= 2 * nums[secondIndex])
//            return maxIndex;
//        else
//            return -1;
        if (nums.length == 1)
            return 0;
        //max为最大数下标，second_max为次大数
        int max = 0, second_max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                second_max = nums[max];
                max = i;
            } else if (nums[i] > second_max)
                second_max = nums[i];
        }
        return nums[max] >= second_max * 2 ? max : -1;
    }
}
