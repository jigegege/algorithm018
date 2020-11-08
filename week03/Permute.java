package com.jige.leetcode;

public class Permute {
    if(nums==null) {
        return new ArrayList<List<Integer>>();
    }
    List<List<Integer>> res = new LinkedList<List<Integer>>();
    Queue<Integer> queue = new LinkedList<Integer>();
    for(int i : nums) {
        queue.offer(i);
    }
    dfs(res,queue,new LinkedList<Integer>());
        return res;
    }

    private void dfs(List<List<Integer>> res, Queue<Integer> queue, LinkedList<Integer> arr) {
        if(queue.isEmpty()) {
            res.add(new LinkedList(arr));
            return;
        }
        int size = queue.size();
        for(int i=0;i<size;++i) {
            arr.add(queue.poll());
            dfs(res,queue,arr);
            queue.offer(arr.removeLast());
        }
    }
}
