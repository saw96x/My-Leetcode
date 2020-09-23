package com.MyLeetCode;

import java.util.Arrays;

public class longestCommonPrefix_14 {
    //编写一个函数来查找字符串数组中的最长公共前缀。
    //如果不存在公共前缀，返回空字符串 ""。
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0 || strs == null)
            return "";
        //将每个元素的字符都与已经确定的字符前缀做对比，一旦发现前缀不匹配，就结束字符对比
        //取出子串作为新的前缀
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < prefix.length(); j++) {
                if (prefix.charAt(j) != strs[i].charAt(j))
                    break;
            }
            prefix = prefix.substring(0, j);
            if ("".equals(prefix))
                return "";
        }
        return prefix;
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0 || strs == null)
            return "";
        //先使用库函数排序数组，然后将第一位与最后一位比较前后缀即可。
        Arrays.sort(strs);
        int fin = strs.length - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length() && i < strs[fin].length(); i++) {
            if (strs[0].charAt(i) == strs[fin - 1].charAt(i))
                sb.append(strs[0].charAt(i));
            else
                return sb.toString();
        }
        return sb.toString();
    }
}
