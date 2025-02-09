package com.tree.tre;

public class BTPathSum
{
	public TreeNode root;
	
	public BTPathSum()
	{
		root = null;
	}
	
	public boolean hasPath(TreeNode root, int sum)
	{
		if(root == null)
		{
			return false;
		}
		if(root.val == sum && root.left == null && root.right == null)
		{
			return true;
		}
		return hasPath(root.left, sum-root.val) || hasPath(root.right, sum - root.val);
	}
}
