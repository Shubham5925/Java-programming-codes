import java.util.Scanner;

class linkedlist
{
	//creating Node
	static class Node
	{
		int data;
		Node next;

		// Default Constructor calling
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	Node head=null;
	
	public void createnode()
	{

		Scanner sc=new Scanner(System.in);
		int n;
		do{
			int data1=sc.nextInt();
			Node new_node=new Node(data1);
			
			if(head==null)
			{
				head=new_node;
			}

			else
			{
				new_node.next=head;
				head=new_node;
			}
			System.out.print("Do you want to enter more data press 1 or to close enter -1:");
			n=sc.nextInt();
		}while(n!=-1);
		return;
	}


	public void del_beg()
	{
		Node temp;
		if(head==null)
			System.out.println("No node present");

		else
		{
			temp=head;
			head=temp.next;
			temp.next=null;
			System.out.print("Node deleted Successfully at beg");

		}

	}

	public void del_last()
	{
		
		if(head==null)
			System.out.println("No node present in linked list");

		else
		{
			Node temp=head;
			Node ptr=temp.next;

			while(ptr.next!=null)
			{
				temp=ptr;
				ptr=temp.next;
			}

			temp.next=null;
			System.out.print("Node deleted successfully at last");
		}
	}

	public void add_beg()
	{
		int data2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter node value to add at beginning");
		data2=sc.nextInt();

		Node node2=new Node(data2);

		if(head==null)
			head=node2;
		else
		{
			Node temp=head;
			node2.next=head;
			head=node2;

		}
	}
	
	public void add_last()
	{
		int data3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the node value you want to insert at last");

		data3=sc.nextInt();

		Node node3=new Node(data3);

		if(head==null)
			System.out.print("No Node Present");

		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node3;
			node3.next=null;
			System.out.print("Node added successfully at last");
		}
	}



	public void del_between()
	{
			
	}

	public void reverse()
	{
		if (head==null)
			System.out.print("No Node present");
		else if(head.next==null)
			System.out.print("Only One node present");
		else
		{
			Node temp=head;
			Node ptr=temp.next;

			while(ptr.next!=null)
			{

				temp.next=head;
				

			}

		}
	}
	public void display()
	{
		Node temp;
		temp=head;

		if (head==null)
			System.out.print("NO node present in the linked list");

		else
		{
			while(temp!=null)
			{
				System.out.print(" "+temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String args[])
	{
		linkedlist ll=new linkedlist();

		//Sequential Approach
		/*
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Node value");
			ll.createnode();
		}
		

		ll.display();

		ll.del_beg();
		ll.display();

		ll.del_last();
		ll.display();
		*/

		//Best way to use every function completely and effectively;
		while(true)
		{
			System.out.print("-----------MAIN--------------"+"\n");
			Scanner sc=new Scanner(System.in);
			System.out.print("1-createnode"+"\n"+"2-del_beg"+"\n"+"3-del_last"+"\n"+"4-add_beg"+"\n"+"5-add_last"+"\n"+"6-display"+"\n"+"7-Exit"+"\n");
			System.out.print("Enter the choice :");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:ll.createnode();	break;
				case 2:ll.del_beg();	break;
				case 3:ll.del_last();	break;
				case 4:ll.add_beg();	break;
				case 5:ll.add_last();	break;
				case 6:ll.display();	break;
				case 7:return;
			}
		}
		
	}
}