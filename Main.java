package com.GreatLearningprob2;

public class Main {

	public static void main(String[] args) {
	BinaryTreePairSum tree = new BinaryTreePairSum();

    tree.root = new TreeNode(40);
    tree.root.left = new TreeNode(20);
    tree.root.right = new TreeNode(60);
    tree.root.left.left = new TreeNode(10);
    tree.root.left.right = new TreeNode(30);
    tree.root.right.left = new TreeNode(50);
    tree.root.right.right = new TreeNode(70);

    int targetSum = 130;
    tree.findPair(tree.root, targetSum);{
	}
	}
}

