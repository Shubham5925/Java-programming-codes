//Circular Linked List in Java

import java.util.Scanner;

class circular_list
{
	static class Node
	{
		int data;
		Node next;
		
		//Default Constructor calling

		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	Node head=null;

	public void createnode()
	{
		int n,data;
		do{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the node value");
			data=sc.nextInt();

			Node new_node=new Node(data);

			if(head==null)
			{
				head=new_node;
				new_node.next=head;
			}
			else
			{
				Node temp=head;
				new_node.next=head.next;
				head=new_node;

			}

			
			System.out.print("Enter 1 to again execute otherwise enter -1 to stop");
			n=sc.nextInt();

		}while(n!=-1);
	}


	public void display()
	{
		if(head==null)
			System.out.print("No Node present");
		else
		{
			Node temp;
			temp=head;

			while(temp!=head)
			{
					System.out.print(temp.data);
					temp=temp.next;
			}
		}
	}



	public static void main(String args[])
	{
		circular_list cl=new circular_list();

		while(true)
		{
			int ch;
			Scanner sc=new Scanner(System.in);
			System.out.print("1-createnode"+"\n"+"2-display"+'\n'+"3-Exit"+"\n");
			System.out.print("Enter your choice");
			ch=sc.nextInt();

			switch(ch)
			{
				case 1:cl.createnode();	break;
				case 2:cl.display();	break;
				case 3:return;
			}

		}
	}

}