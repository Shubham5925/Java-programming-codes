//Creating Binary Tree

import java.util.Scanner;

class tree
{
	static class Node
	{
		int data;
		Node left;
		Node right;

		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}

	Node head=null;

	static Node create()
	{
		Scanner sc=new Scanner(System.in);
		Node root=null;
		System.out.print("Enter data");
		int data=sc.nextInt();

		if(data==-1)
			return null;
		root=new Node(data);
		System.out.print("Enter left child of"+root);
		root.left=create();
		System.out.print("ENter the right child of "+root);
		root.right=create();
		return root;
	}

	static void inorder(Node root)
	{
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
	}

	public static void main(String args[])
	{
		Node root=create();
		inorder(root);


	}	
	
}