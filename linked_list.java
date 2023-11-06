import java.util.Scanner;   //java util function

class linkedlist{


	static class Node
	{
		//node structure 
		int data;
		Node next;

		//default constructor calling

		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node head=null;
														
	Scanner sc=new Scanner(System.in);
	
	int data=sc.nextInt();
	Node newnode=new Node(data);
	
	public void createnode()
	{
		
		if (head==null)
			head=newnode;
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void delete()
	{
		if(head==null)
			System.out.println("linked list empty");		
		else{
			//delete at beginning logic used 
			Node temp;
			temp=head;
			head=temp.next;
			temp.next=null;
		}
	}
	
	public void display()
	{
		Node temp;
		temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;	
		}
	}

	
	public static void main(String args[])
	{

		linkedlist obj=new linkedlist();
		
	
		
		for(int i=0;i<4;i++){
			System.out.println("enter node values");
			obj.createnode();
		}
		

		obj.display();
	}
}	
	
	

	