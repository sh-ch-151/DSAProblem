package com.tree.driver;

import com.tree.tre.TreeNode;
import com.tree.tre.RightReviewTree;

import java.util.List;

public class RightViewTreeDriver
{
	public static void main(String[] args)
	{
		RightReviewTree tree = new RightReviewTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		List<Integer> nodes = tree.rightView(tree.root);
		for(Integer node : nodes)
		{
			System.out.println(node);
		}
	}
}
