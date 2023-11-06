class cmd
{
	public static void main(String ar[])
	{
		int percent,total;
		int n1=Integer.parseInt(ar[0]);
		int n2=Integer.parseInt(ar[1]);
		int n3=Integer.parseInt(ar[2]);
		total=n1+n2+n3;
		percent=(n1+n2+n3)*100/300;
		
		System.out.println("physics marks out of 100 is :"+n1);
		System.out.println("chemistry marks out of 100 is :"+n2);
		System.out.println("maths marks out of 100 is : "+n3);
		
		System.out.println("total marks of PCM is :"+total+"/300");
		System.out.println("total percentage is "+percent+"%");
	}
}
		
