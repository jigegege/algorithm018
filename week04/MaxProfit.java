package com.jige.leetcode;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < prices.length; i++) {

            if (prices[i - 1] < prices[i]) {
                res += prices[i] - prices[i -  1];
            }
        }
        return res;
    }
}
