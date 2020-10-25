package com.jige.leetcode;

/**
 * 1. 两数之和
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return result;
        }
        HashMap<Integer, Integer> cache = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (cache.containsKey(nums[i])) {
                result[0] = cache.get(nums[i]);
                result[1] = i;
                break;
            }
            cache.put(target - nums[i], i);
        }
        return result;
    }
}
