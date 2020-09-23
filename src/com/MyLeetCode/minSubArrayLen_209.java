package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/17 - 16:52
 */
public class minSubArrayLen_209 {
    //给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。

    //暴力解法
    public int minSubArrayLen1(int s, int[] nums) {
        if (nums.length == 0)
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= s) {
                    ans = Integer.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    //双指针法
    public int minSubArrayLen2(int s, int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int fast = 0, slow = 0, ans = Integer.MAX_VALUE, sum = 0;
        while (fast < n) {
            sum += nums[fast];
            while (sum >= s) {
                ans = Integer.min(ans, fast - slow + 1);
                sum -= nums[slow];
                slow++;
            }
            fast++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
