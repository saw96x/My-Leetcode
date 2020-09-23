package com.MyLeetCode;

import jdk.jfr.StackTrace;

public class isPalindrome_9 {
    //判断一个整数是否是回文数。
    // 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public boolean isPalindrome1(int x)//toString比较字符
    {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        if (x > 0 && x < 10)
            return true;
        Integer a = x;
        String res = a.toString();
        int front = 0, back = res.length() - 1;
        while (front <= back) {
            if (res.charAt(front) != res.charAt(back))
                return false;
            front++;
            back--;
        }
        return true;
    }

    public boolean isPalindrome2(int x)//直接颠倒原数并比较
    {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        long res = 0, save = x;//用long防溢出
        while (x != 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return res == save;
    }

    public static boolean IsPalindrome3(int x)//逆转的进化版（选记）
    {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        //通过观察变量的变化，可以发现，这种计算方式可以减少一半的循环次数
        //实际上是将前后的数字分割开进行比较，例如1221，分割成了12和12（x和revertedNumber）
        //例如12321分割成12和123，然后通过return比较完成判断
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String []args){
        System.out.println(IsPalindrome3(1221));
    }
}
