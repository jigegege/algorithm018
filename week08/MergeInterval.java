package com.jige.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length<=1) {
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        int i=0;
        int n = intervals.length;
        while(i<n){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while(i<n-1 && right>=intervals[i+1][0]){
                right = Math.max(right,intervals[i+1][1]);
                i++;
            }
            list.add(new int[] {left,right});
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}
