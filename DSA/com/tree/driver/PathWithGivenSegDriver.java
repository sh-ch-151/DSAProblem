package com.tree.driver;

import com.tree.tre.PathWithGivenSeq;
import com.tree.tre.TreeNode;

public class PathWithGivenSegDriver
{
	public static void main(String[] args)
	{
		PathWithGivenSeq seq = new PathWithGivenSeq();
		seq.root = new TreeNode(3);
		seq.root.left = new TreeNode(7);
		seq.root.right = new TreeNode(1);
		seq.root.left.left = new TreeNode(9);
		seq.root.right.left = new TreeNode(2);
		seq.root.right.right = new TreeNode(5);
		boolean ans = seq.hasPath(seq.root, new int[] {3, 1, 2});
		System.out.println(ans);
	}
}
