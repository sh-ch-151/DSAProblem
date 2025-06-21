package com.tree.driver;

import com.tree.tre.RightReviewTree;
import com.tree.tre.SumOfPathNodes;
import com.tree.tre.TreeNode;

import java.util.List;

public class SumOfPathNodeDriver
{
	public static void main(String[] args)
	{
		SumOfPathNodes tree = new SumOfPathNodes();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		int sum = tree.findSumPathNummbers(tree.root);
		System.out.println(sum);
	}
}
