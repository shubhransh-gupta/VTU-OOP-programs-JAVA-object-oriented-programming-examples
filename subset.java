import java.util.Scanner;
public class subset 
{
  static int c=0;
  public static void main(String[]args)
  {
	  int w[]=new int[10],d,n,i,sum=0,x[]=new int[10];
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number of elements");
	  n=in.nextInt();
	  System.out.println("Enter the elements in ascending order");
	  for(i=0;i<n;i++)
	  w[i]=in.nextInt();
	  System.out.println("Enter the value of d");
	  d=in.nextInt();
	  for(i=0;i<n;i++)
		  sum=sum+w[i];
	  System.out.println("SUM = "+sum);
	  if(sum<d||w[0]>d)
	  {
		  System.out.println("Subset is not possible");
		  System.exit(0);
	  }
	  finals(0,0,sum,x,w,d);
	  if(c==0)
		  System.out.println("Subset is not possible");
  }
  static void finals(int cs,int k,int r,int x[],int w[],int d)
  {
	  x[k]=1;
	  if(cs+w[k]==d)
	  {
		  c++;
		  System.out.println("Solution "+c+" is { ");
		  for(int i=0;i<=k;i++)
			  if(x[i]==1)
			  {
				  System.out.println(w[i]+" ");
			  }
		  System.out.println(" }");
	  }
	  else if((cs+w[k]+w[k+1])<=d)
		  finals(cs+w[k],k+1,r-w[k],x,w,d);
	  if((cs+r-w[k])>=d&&(cs+w[k])<=d)
	  {
		  x[k]=0;
		  finals(cs,k+1,r-w[k],x,w,d);
	  }
  }
}
	