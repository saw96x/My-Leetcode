package com.MyLeetCode;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

/**
 * @author Saw96x
 * @date 2020/9/8 - 8:32
 */
public class strStr_28 {
    //暴力循环
    public static int strStr1(String haystack, String needle) {
        if ((haystack != null && haystack.equals(needle)) || ("".equals(needle) || needle == null))
            return 0;
        if ("".equals(haystack) || haystack == null)
            return -1;
        //双重循环，逐一匹配
        for (int ph = 0; ph <= haystack.length() - needle.length(); ph++) {
            for (int pn = 0; pn < needle.length(); pn++) {
                if (needle.charAt(pn) != haystack.charAt(ph + pn))
                    break;
                if (pn == needle.length() - 1)
                    return ph;
            }
        }
        return -1;
    }

    //库函数
    public static int strStr2(String haystack, String needle) {
        if ((haystack != null && haystack.equals(needle)) || ("".equals(needle) || needle == null))
            return 0;
        if ("".equals(haystack) || haystack == null)
            return -1;
        //直接使用库函数
        return haystack.indexOf(needle);
    }

    //滑动窗口
    public static int strStr3(String haystack, String needle) {
        if ((haystack != null && haystack.equals(needle)) || ("".equals(needle) || needle == null))
            return 0;
        if ("".equals(haystack) || haystack == null)
            return -1;
        int hSize = haystack.length(), nSize = needle.length();
        for (int i = 0; i < hSize - nSize + 1; i++) {
            if (haystack.substring(i, i + nSize).equals(needle))
                return i;
        }
        return -1;
    }

    //KMP，以后学会了再写
    public static int strStr4(String haystack, String needle) {
        if (haystack != null && haystack.equals(needle))
            return 0;
        if ("".equals(needle) || needle == null)
            return 0;
        if ("".equals(haystack) || haystack == null)
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(strStr1("hello", "ll"));
    }
}
