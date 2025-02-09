package com.tree.driver;

import com.tree.tre.BTImpl;
import com.tree.tre.BTPathSum;
import com.tree.tre.TreeNode;

public class BTPathSumDriver
{
	public static void main(String[] args)
	{
		BTPathSum tree = new BTPathSum();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		System.out.println(tree.hasPath(tree.root, 7));
		
	}
}
