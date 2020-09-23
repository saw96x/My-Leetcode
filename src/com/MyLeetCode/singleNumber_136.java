package com.MyLeetCode;

import java.util.HashMap;

/**
 * @author Saw96x
 * @date 2020/9/13 - 8:01
 */
public class singleNumber_136 {
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

    //异或运算具有交换律，同时相同的数异或等于0，因此从头开始异或到结尾，最后的结果就是只出现一次的数
    public int singleNumber1(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++)
            ans = nums[i] ^ ans;
        return ans;
    }

    //hash表,第一次循环搞到每个数对应的出现次数，第二次看出现次数为1的数是哪个
    public int singleNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = ((count == null) ? 1 : count++);
            map.put(i, count);
        }

        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (i == 1)
                return i;
        }
        return -1;
    }
}
