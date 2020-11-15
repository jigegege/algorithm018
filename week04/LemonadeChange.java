package com.jige.leetcode;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) {
            return false;
        }
        int five = 0, ten = 0;
        for(int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                ten++;
                five--;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }
}
