//Doubly Linked List in Java

import java.util.Scanner; 

class doublyll
{
	static class Node
	{
		int data;
		Node left;
		Node right;

		//Default Constructor calling

		Node (int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}

	Node head=null;

	public void createnode()
	{
		int n;
		do
		{
			int data;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the node value");
			data=sc.nextInt();
			Node new_node=new Node(data);

			if(head==null)
				head=new_node;
			else
			{
				new_node.right=head.right;
				head=new_node;
				new_node.left=null;

			}
			System.out.print("Enter 1 to restar, and -1 to stop");
			n=sc.nextInt();
		
		}while(n!=-1);
	}

	public void display()
	{
		if(head==null)
			System.out.println("No node present");
		else
		{
			Node temp;
			temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data);
				temp=temp.right;
			}

		}
	}


	public static void main(String args[])
	{
		doublyll dll=new doublyll();

		dll.createnode();
		dll.display();
	}
}