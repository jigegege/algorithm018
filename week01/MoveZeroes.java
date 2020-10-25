package com.jige.leetcode;

/**
 * 283. 移动零
 */
public class MoveZeroes {
    public int moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                if(i > j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
