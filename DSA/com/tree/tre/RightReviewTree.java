package com.tree.tre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightReviewTree
{
	public TreeNode root;
	
	public RightReviewTree()
	{
		root = null;
	}
	
	/**
	 *
	 * @return
	 */
	public List<Integer> rightView(TreeNode root)
	{
		List<Integer> result = new ArrayList<>();
		if(root == null)
		{
			return result;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty())
		{
			int size = que.size();
			for(int i = 0; i < size; i++)
			{
				TreeNode curr = que.poll();
				if(i == size - 1)
				{
					result.add(curr.val);
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
		return result;
	}
}
