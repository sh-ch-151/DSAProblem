package com.tree.tre;

import com.stack.stk.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseLevelOrder
{
	public TreeNode root;
	
	public ReverseLevelOrder()
	{
		root = null;
	}
	
	public List<List<Integer>> reverseLevel(TreeNode root)
	{
		List<List<Integer>> bfs = new ArrayList<>();
		List<List<Integer>> newBfs = new ArrayList<>();
		Queue<TreeNode> que = new LinkedList<>();
		if(root == null)
		{
			return bfs;
		}
		que.offer(root);
		while(!que.isEmpty())
		{
			int size = que.size();
			List<Integer> curr = new ArrayList<>();
			for(int i = 0; i < size; i++)
			{
				TreeNode currNode = que.poll();
				curr.add(currNode.val);
				if(currNode.left != null)
				{
					que.offer(currNode.left);
				}
				if(currNode.right != null)
				{
					que.offer(currNode.right);
				}
			}
			bfs.add(curr);
		}
		for(int i = bfs.size()-1; i >= 0; i--)
		{
			newBfs.add(bfs.get(i));
		}
		return newBfs;
	}
}
