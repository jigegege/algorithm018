package com.jige.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        handle(root);
        return res;
    }
    public void handle(Node root){
        if (root==null) return;
        res.add(root.val);
        for (int i = 0; i <root.children.size() ; i++) {
            handle(root.children.get(i));
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
