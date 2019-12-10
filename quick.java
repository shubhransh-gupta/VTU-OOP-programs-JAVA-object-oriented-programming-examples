import java.util.*;
public class quick 
{
  public static void main(String[]args)
  {
	  int a[]=new int[10000];
	  Scanner in =new Scanner(System.in);
	  long start,end;
	  System.out.println("Enter the number of elements to be sorted");
	  int n=in.nextInt();
	  Random rand=new Random();
	  for(int i=0;i<n;i++)
		  a[i]=rand.nextInt(10000);
	  System.out.println("Array elements to be sorted are : ");
	  for(int i=0;i<n;i++)
		  System.out.println(a[i]+"  ");
	  a[n]=9999;
	  start=System.nanoTime();
	  quicksort(a,0,n-1);
	  end=System.nanoTime();
	  System.out.println("The sorted elements are : ");
	  for(int i=0;i<n;i++)
	  System.out.println(a[i]+"  ");
	  System.out.println("\n The time taken to sort is "+ (end-start)+"ns");
  }
  static void quicksort(int a[],int p,int q)
  {
	 int j;
	 if(p<q)
	 {
		 j=partition(a,p,q);
		 quicksort(a,p,j-1);
		 quicksort(a,j+1,q);
	 }
  }
  static int partition(int a[],int m,int p)
  {
	  int i,j;
	  int v=a[m];
	  i=m;
	  j=p;
	  while(i==j)
	  {
		  while(a[i]<=v)
			  i++;
		  while(a[i]>v)
			  j--;
		  if(i<j)
			  interchange(a,i,j);
	  }
	  a[m]=a[j];
	  a[j]=v;
	  return j;
  }
  static void interchange(int a[],int i,int j)
  {
	  int p;
	  p=a[i];
	  a[i]=a[j];
	  a[j]=p;
  }
}
