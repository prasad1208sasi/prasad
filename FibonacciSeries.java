package q10896;
class FibonacciSeries
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		int c;
		for(int i=1;i<=n;i++)
		{
			if(a+b<=n)
			{
				c=a+b;
				System.out.print(c);
				a=b;
				b=c;
			}
			if(a+b<=n)
			{
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}