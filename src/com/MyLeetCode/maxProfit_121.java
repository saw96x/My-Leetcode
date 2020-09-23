package com.MyLeetCode;

/**
 * @author Saw96x
 * @date 2020/9/12 - 10:06
 */
public class maxProfit_121 {
//    给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//
//    如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
//
//    注意：你不能在买入股票前卖出股票。

    //动态规划
    public int maxProfit1(int[] prices) {
        if (prices.length == 0 || prices == null)
            return 0;
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min)
                max = Math.max(max, prices[i] - min);//f(i)=max(f(i-1),f(i))
            else
                min = prices[i];
        }
        return max;
    }

    //暴力解法
    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit)
                    maxProfit = profit;
            }
        }
        return maxProfit;
    }

    //单调栈法，有空补
    public int maxProfit3(int[] prices){
        return 0;
    }
}
