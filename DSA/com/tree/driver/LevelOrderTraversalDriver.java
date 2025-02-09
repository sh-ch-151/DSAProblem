package com.tree.driver;

import com.tree.tre.LevelOrderTraversal;
import com.tree.tre.TreeNode;

import java.util.List;

public class LevelOrderTraversalDriver
{
	public static void main(String[] args)
	{
		LevelOrderTraversal traversal = new LevelOrderTraversal();
		traversal.root = new TreeNode(1);
		traversal.root.left = new TreeNode(2);
		traversal.root.right = new TreeNode(3);
		traversal.root.left.left = new TreeNode(4);
		traversal.root.left.right = new TreeNode(5);
		traversal.root.right.left = new TreeNode(6);
		traversal.root.right.right = new TreeNode(7);
		
		List<List<Integer>> bfs = traversal.traverse(traversal.root);
		
		for(List<Integer> ans : bfs)
		{
			System.out.println(ans.toString());
		}
		
	}
}
