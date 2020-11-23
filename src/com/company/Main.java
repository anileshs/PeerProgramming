package com.company;

public class Main {

    public static void main(String[] args) {
	    // 1. Create test tree
        var root = new BinaryTreeNode(5);
        root.left = new BinaryTreeNode(3);
        root.right = new BinaryTreeNode(4);
        root.left.left = new BinaryTreeNode(7);
        root.left.right = new BinaryTreeNode(2);
        root.left.right.right = new BinaryTreeNode(-1);
        root.right.left = new BinaryTreeNode(-3);
        root.right.right = new BinaryTreeNode(6);
    }
}
