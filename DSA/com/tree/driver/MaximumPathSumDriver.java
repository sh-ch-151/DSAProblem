package com.tree.driver;

import com.tree.tre.MaximumPathSum;
import com.tree.tre.TreeNode;

public class MaximumPathSumDriver
{
	public static void main(String[] args)
	{
		MaximumPathSum path = new MaximumPathSum();
		path.root = new TreeNode(10);
		path.root.left = new TreeNode(2);
		path.root.right = new TreeNode(10);
		path.root.left.left = new TreeNode(20);
		path.root.left.right = new TreeNode(1);
		path.root.right.left = new TreeNode(-25);
		path.root.right.left.left = new TreeNode(3);
		path.root.right.left.right = new TreeNode(4);
		int ans = path.findMaxPathSum(path.root);
		System.out.println(ans);
	}

}
