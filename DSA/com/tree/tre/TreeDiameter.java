/**
 *
 */
package com.tree.tre;

public class TreeDiameter
{
	public TreeNode root;
	int diameter = 0;
	
	public TreeDiameter()
	{
		root = null;
	}
	
	private int findHeight(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		int leftHeight = findHeight(root.left);
		int rightHeight = findHeight(root.left);
		int currentDiameter = leftHeight + rightHeight + 1;
		diameter = Math.max(currentDiameter, diameter);
		return Math.max(leftHeight, rightHeight) +1;
	}
	
	public int findDiameter(TreeNode root)
	{
		findHeight(root);
		return diameter;
	}
}
