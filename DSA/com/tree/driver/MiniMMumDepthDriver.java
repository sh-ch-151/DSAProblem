package com.tree.driver;

import com.tree.tre.MinimumDepth;
import com.tree.tre.TreeNode;

public class MiniMMumDepthDriver
{
	public static void main(String[] args)
	{
		MinimumDepth tree = new MinimumDepth();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		System.out.println(tree.minimumDepth(tree.root));
	}
	
}
