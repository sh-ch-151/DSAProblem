package com.tree.tre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal
{
	public TreeNode root;
	public LevelOrderTraversal()
	{
		root = null;
	}
	
	public List<List<Integer>> traverse(TreeNode root)
	{
		List<List<Integer>> bfs = new ArrayList<>();
		if(root == null)
		{
			return bfs;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty())
		{
			int size = que.size();
			List<Integer> currLevel = new ArrayList<>();
			for(int i =0; i < size; i++)
			{
				TreeNode curr = que.poll();
				currLevel.add(curr.val);
				if(curr.left != null)
				{
					que.offer(curr.left);
				}
				if(curr.right != null)
				{
					que.offer(curr.right);
				}
			}
			bfs.add(currLevel);
		}
		return bfs;
	}
}
