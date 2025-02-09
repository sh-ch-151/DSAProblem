package com.tree.tre;

public class BTImpl
{
	public TreeNode root;

	public BTImpl()
	{
		root = null;
	}

	public void preOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			inOrder(root.left);
			System.out.println(root.val);
			inOrder(root.right);
		}
	}

	public void postOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.val);
		}
	}
	
	public int noOfNodes(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		return 1 + noOfNodes(root.left) + noOfNodes(root.right);
	}
	
	public int noOfLeapNode(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		if(root.left == null && root.right == null)
		{
			return 1;
		}
		return noOfLeapNode(root.left) + noOfLeapNode(root.right);
	}
	
	public int noOfNonLeapNode(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		if(root.left == null || root.right == null)
		{
			return 0;
		}
		return 1 + noOfNonLeapNode(root.left) + noOfNonLeapNode(root.right);
	}
	
	public int numOfFullNode(TreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		if(root.left == null || root.right == null)
		{
			return 0;
		}
		return 1 + numOfFullNode(root.left) + numOfFullNode(root.right);
	}
}
