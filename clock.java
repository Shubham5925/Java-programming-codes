import java.util.Scanner;
class clock
{
	public static void main (String ar[])
	{
		int h=0,m=0,s=0,i;
		System.out.print("set time in format hh:mm:ss");
		Scanner r=new Scanner(System.in);
		h=r.nextInt();
		m=r.nextInt();
		s=r.nextInt();		
		for(h=0;h<60;h++)
		{
			for(m=0;m<60;m++)
			{
				for(s=0;s<60;s++)
				{
					  {
	  					  System.out.print(h+m+s);
						 // System.out.print();
						//  System.out.print();
						 if(h<12)
	    					{
	     						 System.out.print("AM");
	    					  }
	    					  else
	   					   {
	    						   System.out.print("PM");
	   					    }
							for( i=0;i<3619999;i++)
							{
								i++;
								i--;
							}
							 s=0;
							 }
							 m=0;
							 }
		 					h=0;
							}
						
					

				
		}	
		
	}
}
							  
					