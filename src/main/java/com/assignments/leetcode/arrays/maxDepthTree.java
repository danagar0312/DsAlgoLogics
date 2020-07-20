package com.assignments.leetcode.arrays;

public class maxDepthTree {

    public int getSize(TreeNode root) {
        int size, leftMax = 0, rightMax = 0;


        if (root == null) {
            size = 0;
        }

        if (root.left != null) {
            leftMax = getSize(root.left);
        }

        if (root.right != null) {
            rightMax = getSize(root.right);
        }

        size = 1 + Math.max(leftMax, rightMax);

        return size;
    }

}


