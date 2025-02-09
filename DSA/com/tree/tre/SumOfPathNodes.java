package com.tree.tre;

public class SumOfPathNodes
{
	public TreeNode root;
	
	SumOfPathNodes()
	{
		root = null;
	}
	
	private int findPathSum(TreeNode root, int sum)
	{
		if(root == null)
		{
			return 0;
		}
		sum = 10 * sum + root.val;
		if(root.left == null && root.right == null)
		{
			return sum;
		}
		return findPathSum(root.left, sum) + findPathSum(root.right, sum);
	}
	
	public int findSumPathNummbers(TreeNode root)
	{
		return findPathSum(root, 0);
	}
}
