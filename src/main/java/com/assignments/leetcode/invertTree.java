package com.assignments.leetcode;

public class invertTree {
    public TreeNode getInvertedTree(TreeNode root){

//        TreeNode temp = null;

        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left  = getInvertedTree(left);
        root.right = getInvertedTree(right);

        return root;

    }

}
