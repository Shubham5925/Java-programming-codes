class sample
{
	public static void main(String ar[])
	{
		int amt,DIP,DIA,PA;
		amt=Integer.parseInt(ar[0]);
		if(amt>3000)
		    DIP=30;
		
		else if(amt>2000)
		    DIP=20;
		else if(amt>1000)
		    DIP=10;
		else
		    DIP=0;
		
		DIA=(amt/100)*DIP;
		PA=amt-DIA;
		System.out.print("paid amount is"+PA);
	}
}
		