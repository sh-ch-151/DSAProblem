package com.tree.driver;

import com.tree.tre.LeftViewTree;
import com.tree.tre.TreeNode;

import java.util.List;

public class LeftViewDriver
{
	public static void main(String[] args) {
		LeftViewTree tree = new LeftViewTree();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		List<Integer> nodes = tree.leftView(tree.root);
		for(int i = 0; i < nodes.size(); i++)
		{
			System.out.println(nodes.get(i));
		}
	}
	
}
