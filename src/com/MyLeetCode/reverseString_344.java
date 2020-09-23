package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/18 - 11:07
 */
public class reverseString_344 {
    //编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
    //
    //不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

    public void reverseString(char[] s) {
        if (s.length == 1 || s.length == 0 || s == null)
            return;
        int front = s.length - 1, back = 0;
        while (front > back) {
            char temp = s[front];
            s[front] = s[back];
            s[back] = temp;
            front--;
            back++;
        }
    }
}