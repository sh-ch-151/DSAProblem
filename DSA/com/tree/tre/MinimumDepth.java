package com.tree.tre;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepth
{
	public TreeNode root;
	
	public MinimumDepth()
	{
		root = null;
	}
	
	public int minimumDepth(TreeNode root)
	{
		int depth = 0;
		if(root == null)
		{
			return depth;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty())
		{
			depth++;
			int size = que.size();
			for(int i =0; i < size; i++)
			{
				TreeNode curr = que.poll();
				if(curr.left == null && curr.right == null)
				{
					return depth;
				}
				if(curr.left != null)
				{
					que.offer(curr.left);
				}
				if(curr.right != null)
				{
					que.offer(curr.right);
				}
			}
		}
		return depth;
	}
}
