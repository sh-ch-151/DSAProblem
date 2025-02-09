package com.tree.driver;

import com.tree.tre.BTImpl;
import com.tree.tre.TreeNode;

public class BTDriver
{
	public static void main(String[] args)
	{
		BTImpl tree = new BTImpl();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);

		System.out.print("Pre Order Traversal is: ");
		tree.preOrder(tree.root);
		System.out.println();

		System.out.print("In Order Traversal is: ");
		tree.inOrder(tree.root);
		System.out.println();

		System.out.print("Post Order Traversal is: ");
		tree.postOrder(tree.root);
		System.out.println();
		
		System.out.println("No of nodes = " + tree.noOfNodes(tree.root));
		
		System.out.println("No of leap nodes = " + tree.noOfLeapNode(tree.root));
		
		System.out.println("No of non leap node = " + tree.noOfNonLeapNode(tree.root));
		
		System.out.println("No of full node = " +tree.numOfFullNode(tree.root));
	}
}
