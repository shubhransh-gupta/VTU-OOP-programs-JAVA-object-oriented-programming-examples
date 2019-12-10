import java.util.Scanner;
class greedy
{
	int n,m,w[],p[];
	public greedy(int n,int m, int w[],int p[])
	{
		this.n=n;
		this.m=m;
		this.w=w;
		this.p=p;
	}
	public void greedy()
	{
		float sum=0,max;
		int i,j=0;
		while(m>=0)
		{
			max=0;
			for(i=0;i<n;i++)
			{
				if((float)p[i]/(float)w[i]>max)
				{
					max=((float)p[i]/(float)w[i]);
							j=i;
				}
			}
			if(w[j]>m)
			{
				System.out.println("Quantity of item number : "+(j+1)+"added is "+(float)m/w[j]);
				sum=sum+m*max;
				m=-1;
			}
			else
			{
				System.out.println("Quantity of item number : "+(j+1)+"added fully");
				m=m-w[j];
				sum=sum+(float)p[j];
				p[j]=0;
			}
		}
		System.out.println("Total profit is : "+sum);
	}
}
public class knapsack 
{
   public static void main(String[]args)
   {
	   int i,m,n;
	   Scanner in=new Scanner(System.in);
	   int w[]=new int[10],p[]=new int[10];
	   System.out.println("Enter no. of items");
	   n=in.nextInt();
	   System.out.println("Enter the weight of each item");
	   for(i=0;i<n;i++)
		   w[i]=in.nextInt();
	   System.out.println("Enter the profit of each item");
	   for(i=0;i<n;i++)
		   p[i]=in.nextInt();
	   System.out.println("Enter the capacity");
	   m=in.nextInt();
	   greedy gks=new greedy(n,m,w,p);
	   gks.greedy();
	   in.close();
   }
}
