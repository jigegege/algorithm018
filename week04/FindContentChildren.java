package com.jige.leetcode;

import java.util.Arrays;

public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        if ((g == null || g.length == 0) || (s == null || s.length == 0)) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gg = 0, ss = 0;
        while (gg < g.length && ss < s.length) {
            if (g[gg] <= s[ss]) {
                gg++;
            }
            ss++;
        }
        return gg;
    }
}
