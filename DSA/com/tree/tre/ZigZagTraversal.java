package com.tree.tre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal
{
	public TreeNode root;
	
	public ZigZagTraversal()
	{
		root = null;
	}
	
	public List<List<Integer>> traverse(TreeNode root)
	{
		List<List<Integer>> bfs = new ArrayList<>();
		boolean leftToRight = true;
		if(root == null)
		{
			return bfs;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty())
		{
			List<Integer> curr = new ArrayList<>();
			int size = que.size();
			for(int i = 0; i< size; i++)
			{
				TreeNode current = que.poll();
				if(leftToRight)
				{
					curr.add(current.val);
				}
				else
				{
//					curr.add(0, current.data);
					curr.addFirst(current.val);
				}
				if(current.left != null)
				{
					que.offer(current.left);
				}
				if(current.right != null)
				{
					que.offer(current.right);
				}
			}
			bfs.add(curr);
			leftToRight = !leftToRight;
		}
		return  bfs;
	}
	
}
