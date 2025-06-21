package com.tree.tre;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccesor
{
	public TreeNode root;
	
	public LevelOrderSuccesor()
	{
		root = null;
	}
	
	public TreeNode getSuccessor(TreeNode root, int key)
	{
		Queue<TreeNode> queue = new LinkedList<>();
		if(root == null)
		{
			return null;
		}
		queue.offer(root);
		while(!queue.isEmpty())
		{
			TreeNode current = queue.poll();
			if(current.left != null)
			{
				queue.offer(current.left);
			}
			if(current.right != null)
			{
				queue.offer(current.right);
			}
			if(current.val == key)
			{
				break;
			}
		}
		return queue.poll();
	}
}
