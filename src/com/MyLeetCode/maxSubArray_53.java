package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/9 - 8:12
 */
public class maxSubArray_53 {

    //贪心算法
    public int maxSubArray1(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        //只有一个长度的数组，可以直接返回
        if (nums.length == 1)
            return nums[0];
        //类似寻找最大最小值的题目，初始值一定要定义成理论上的最小最大值
        int maxSum = Integer.MIN_VALUE, thisSum = 0;
        //贪心算法
        for (int i = 0; i < nums.length; i++) {
            if (thisSum < 0)
                thisSum = 0;
            thisSum += nums[i];
            if (thisSum > maxSum)
                maxSum = thisSum;
        }
        return maxSum;
    }

    public int maxSubArray2(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        //只有一个长度的数组，可以直接返回
        if (nums.length == 1)
            return nums[0];
        //类似寻找最大最小值的题目，初始值一定要定义成理论上的最小最大值
        int maxSum = Integer.MIN_VALUE, thisSum = 0;
        for (int i = 0; i < nums.length; i++) {
            thisSum = 0;
            for (int j = i; j < nums.length; j++) {
                thisSum += nums[j];
                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        }
        return maxSum;
    }

    public int maxSubArray3(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        //只有一个长度的数组，可以直接返回
        if (nums.length == 1)
            return nums[0];
        //类似寻找最大最小值的题目，初始值一定要定义成理论上的最小最大值
        int result = Integer.MAX_VALUE;
        //动态规划，每次加之后都选出更大的那个
        int dp = nums[0];
        result = dp;
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(nums[i], dp + nums[i]);
            result = Math.max(dp, result);
        }
        return result;
    }

    //分治法,以后再说
    public int maxSubArray4(int[] nums){
        return 0;
    }
}
