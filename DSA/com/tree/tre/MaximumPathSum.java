package com.tree.tre;

public class MaximumPathSum
{
	public static TreeNode root;

	public MaximumPathSum()
	{
		root = null;
	}
	private static int maxSum;
	private int findMaxSum(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		int leftSum = findMaxSum(root.left);
		int rightSum = findMaxSum(root.right);
		leftSum = Math.max(leftSum, 0);
		rightSum = Math.max(rightSum, 0);
		int currentSum = leftSum + rightSum + root.val;
		maxSum = Math.max(currentSum, maxSum);
		return Math.max(leftSum, rightSum) + root.val;
	}

	public int  findMaxPathSum(TreeNode root)
	{
		maxSum = Integer.MAX_VALUE;
		findMaxSum(root);
		return maxSum;
	}
}
