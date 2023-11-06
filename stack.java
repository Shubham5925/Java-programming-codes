//Stack implementation
import java.util.Scanner;

class stack
{
	int stack[]=new int[10];
	int top=-1;

	public void push()
	{
		int value;
		Scanner sc=new Scanner(System.in);
		

		if(overflow())
			System.out.print("Stack is empty");
		else
		{
			top++;
			System.out.print("Enter the value");
			value=sc.nextInt();
			stack[top]=value;

		}
	}

	public void pop()
	{
		if(underflow())
			System.out.print("Stack is empty");
		else
		{
			int topvalue=stack[top];
			top--;
			System.out.print("Top value pop is:"+topvalue);

		}
	}

	public boolean underflow()
	{
		if(top==-1)
		{
			//System.out.print("Stack is empty");
			return true;
		}
		else
		{
			return false;
			//System.out.print("Stack is full");
		}
	}

	public boolean overflow()
	{
		if(top>9)
		{
			return true;
			//System.out.print("Stack is overflow");
		}
		else
		{
			return false;
			//System.out.print("Stack is not overflow");
		}
	}

	public void display()
	{
		if(underflow())
			System.out.print("Stack is Empty");
		else
		{
			for(int i=0;i<=top;i++)
				System.out.println(stack[i]);
		}
	}


	public static void main(String args[])
	{
		stack stack_obj=new stack();

		//Sequential Method
		/*System.out.print("function started executing");
		stack_obj.push();
		stack_obj.pop();
		stack_obj.display();
		*/

		Scanner sc=new Scanner(System.in);

	 	while(true)
	 	{
	 		int ch;
	 		System.out.print("1-push"+"\n"+"2-pop"+"\n"+"3-display"+"\n"+"4-return"+"\n");
	 		System.out.print("Enter the choice");
	 		ch=sc.nextInt();
	 		switch(ch)
	 		{
	 			case 1:stack_obj.push();	break;
	 			case 2:stack_obj.pop();		break;
	 			case 3:stack_obj.display(); break;
	 			case 4:return;
	 		}

	 	}
	}


}