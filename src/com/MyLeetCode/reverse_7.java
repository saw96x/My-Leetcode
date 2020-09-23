package com.MyLeetCode;

public class reverse_7 {
    //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            //溢出检查
            if (x > Integer.MAX_VALUE / 10||x < Integer.MIN_VALUE / 10)
                return res;
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}
