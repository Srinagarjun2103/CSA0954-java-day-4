import java.util.*;
class factors
{
	public static void main(String[] args)
	{
		int n,i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Given number: ");
		n=sc.nextInt();
		if(n>0)
		{
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
		}
		if(n<0)
		{
			for(i=-1; i>=n; i--)
        		{	
            		if(n%i==0)
				{
					c++;
				}
        		}
		}
		if(n==0)
		{
			System.out.print("Invalid");
			return;
		}
		System.out.print("Number of factors= ");
		System.out.print(c);
	}
}
Footer
