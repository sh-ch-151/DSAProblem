package com.tree.driver;

import com.tree.tre.LevelOrderSuccesor;
import com.tree.tre.TreeNode;

public class LevelOrderSuccessorDriver
{
	public static void main(String[] args)
	{
		LevelOrderSuccesor tree = new LevelOrderSuccesor();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		TreeNode ans = tree.getSuccessor(tree.root, 6);
		System.out.println(ans.val);
	}
}
