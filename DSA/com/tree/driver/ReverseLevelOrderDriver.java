package com.tree.driver;

import com.tree.tre.BTImpl;
import com.tree.tre.ReverseLevelOrder;
import com.tree.tre.TreeNode;

import java.util.List;

public class ReverseLevelOrderDriver
{
	public static void main(String[] args)
	{
		ReverseLevelOrder tree = new ReverseLevelOrder();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		List<List<Integer>> nodes = tree.reverseLevel(tree.root);
		for(int i = 0; i < nodes.size(); i++)
		{
			System.out.println(nodes.get(i));
		}
	}
}
