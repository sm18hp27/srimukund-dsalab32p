package com.GreatLearningprob2;

import java.util.HashSet;
import java.util.Stack;

public class BinaryTreePairSum {

	public TreeNode root;

	public void findPair(TreeNode root, int targetSum) {
		// TODO Auto-generated method stub
		if (root == null) {
            return;
        }

        // Create an empty hash set to store visited nodes
        HashSet<Integer> set = new HashSet<>();
        
        // Traverse the tree in an in-order fashion
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode curr1 = root, curr2 = root;

        while (true) {
            while (curr1 != null) {
                stack1.push(curr1);
                curr1 = curr1.left;
            }

            while (curr2 != null) {
                stack2.push(curr2);
                curr2 = curr2.right;
            }

            if (stack1.isEmpty() || stack2.isEmpty()) {
                break;
            }

            curr1 = stack1.peek();
            curr2 = stack2.peek();

            if (curr1 == curr2) {
                break;
            }

            int sum = curr1.data + curr2.data;

            if (sum == targetSum) {
                System.out.println("Pair is (" + curr1.data + ", " + curr2.data + ")");
                return;
            }

            if (sum < targetSum) {
                stack1.pop();
                curr1 = curr1.right;
            } else {
                stack2.pop();
                curr2 = curr2.left;
            }
        }

        System.out.println("Nodes are not found.");
    }
}
