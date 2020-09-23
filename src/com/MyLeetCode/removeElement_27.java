package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/8 - 7:55
 */
public class removeElement_27 {
    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    //
    //不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
    //
    //元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
    public static int removeElement1(int[] nums, int val) {
        //第一种双指针法，如果快指针的元素值不等于val，就把它赋给慢指针的值，如果
        //等于就跳过，就等价于把相等那些元素都移除了
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static int removeElement2(int[] nums, int val) {
        int back = nums.length;
        int front = 0;
        while (front < back) {
            if (nums[front] == val) {
                //如果前指针front等于val，那么就将其与数组中的最后一个元素交换
                //并减小back，就相当于把不需要的元素释放了
                nums[front] = nums[back - 1];
                back--;
            } else {
                front++;
            }
        }
        //back就相当于数组的长度了
        return back;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement1(nums, 3));
    }
}
