package com.tree.driver;

import com.tree.tre.TreeDiameter;
import com.tree.tre.TreeNode;

public class TreeDiameterDriver
{
	public static void main(String[] args)
	{
		TreeDiameter tree = new TreeDiameter();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.right.left = new TreeNode(4);
		tree.root.right.right = new TreeNode(5);
		tree.root.right.left.left = new TreeNode(6);
		tree.root.right.right.right = new TreeNode(7);
		tree.root.right.right.right.left = new TreeNode(12);
		tree.root.right.right.right.right = new TreeNode(13);
		tree.root.right.left.left.left = new TreeNode(8);
		tree.root.right.left.left.right = new TreeNode(10);
		tree.root.right.left.left.right.left = new TreeNode(11);
		int ans = tree.findDiameter(tree.root);
		System.out.println(ans);
	}
}
