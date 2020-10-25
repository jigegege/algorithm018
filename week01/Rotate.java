package com.jige.leetcode;

/**
 *  旋转数组
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0) {
            return;
        }
        int length, index;
        int[] temps = new int[length = nums.length];
        for (int i = 0; i < length; i++) {
            index = (i + k) % length;
            temps[index] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = temps[i];
        }
    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }
}
