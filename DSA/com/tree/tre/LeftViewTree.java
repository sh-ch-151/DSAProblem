package com.tree.tre;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewTree
{
	public TreeNode root;
	
	public ArrayList<Integer> leftView(TreeNode root)
	{
		ArrayList<Integer> nodes = new ArrayList<>();
		if(root == null)
		{
			return nodes;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty())
		{
			for(int i = 0; i < que.size(); i++)
			{
				TreeNode currNode = que.poll();
				if(i == 0)
				{
					nodes.add(currNode.val);
				}
				if(currNode.left != null)
				{
					que.offer(currNode.left);
				}
				if(currNode.right != null)
				{
					que.offer(currNode.right);
				}
				
			}
		}
		return nodes;
	}
}
