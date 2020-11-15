package com.jige.leetcode;

public class CanJump {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxDistance = nums[0];
        for (int i = 1; i < n; ++i) {
            if (i <= maxDistance) {
                maxDistance = Math.max(i + nums[i], maxDistance);
            } else {
                break;
            }
        }
        return maxDistance >= n - 1;
    }
}
