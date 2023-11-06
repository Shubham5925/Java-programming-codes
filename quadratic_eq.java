//Status -  success
//To check  discriminant exists or not

import java.util.Scanner;
class Tester {
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the coefficient of x^2:");
	    int a=input.nextInt();
	    System.out.print("Enter the coefficient of x:");
	    int b=input.nextInt();
	    System.out.print("Enter the constant value:");
	    int c=input.nextInt();
	    
	    int d=b*b-4*a*c;
	    if(d==0)
	       System.out.println("roots are same");
	   else if(d>0)
	       System.out.println("roots are unequal and real");
	   else
	       System.out.println("roots are imaginary");
	    
	    
		// Implement your code here 
	}
}

