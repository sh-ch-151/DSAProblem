package com.tree.driver;

import com.tree.tre.TreeNode;
import com.tree.tre.ZigZagTraversal;

import java.util.List;

public class ZigZagTraversalDriver
{
	public static void main(String[] args)
	{
		ZigZagTraversal tree = new ZigZagTraversal();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		List<List<Integer>> ans = tree.traverse(tree.root);
		for(List<Integer> level : ans) {
			System.out.println(level.toString());
		}
	}
}
