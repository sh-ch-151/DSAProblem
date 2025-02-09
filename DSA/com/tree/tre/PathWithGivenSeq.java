package com.tree.tre;

public class PathWithGivenSeq
{
	public TreeNode root;
	
	public PathWithGivenSeq()
	{
		root = null;
	}
	
	public boolean hasPath(TreeNode root, int[] seq)
	{
		if(root == null)
		{
			return seq.length == 0;
		}
		return findSequence(root, seq, 0);
	}
	
	private boolean findSequence(TreeNode root, int[] seq, int index)
	{
		if(root == null)
		{
			return false;
		}
		if(root.left == null && root.right == null && index == seq.length - 1 && root.val == seq[index])
		{
			return true;
		}
		if(index >= seq.length || root.val != seq[index])
		{
			return false;
		}
		return findSequence(root.left, seq, index+1) || findSequence(root.right, seq, index+1);
	}
}
