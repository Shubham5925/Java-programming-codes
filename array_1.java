/*Problem Statement
Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.

 

Sample Input and Output
1,5,3=15
3,7,8=8
7,2,9=18
2,6,7=-1
*/

//Status-   wrong output




class Tester {
	public static void main(String[] args) 
	{
	    int array[]=new int[3];
	    array[0]=3;
	    array[1]=7;
	    array[2]=8;
	    
	    for(int i=0;i<array.length;i++)
	    {
	       if(array[i]==7)
	       {
	          if(array[-1]==7)
	              System.out.print("-1");
	          else if(array[-2]==7)
	              System.out.println(-1);
	          else if(array[-3]==7)
	              System.out.println(array[1]*array[2]);
	              break;
	              
	        }
	        else
	        {
	           System.out.println(array[0]*array[1]*array[2]);
	          
	        }
	    }
		// Implement your code here 
	}
}

