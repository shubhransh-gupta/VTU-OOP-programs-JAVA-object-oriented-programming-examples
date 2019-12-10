package subh;

import java.util.Scanner;
public class floyd 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[10][10];
		int i, j;

		Scanner in = new Scanner(System.in); 
		System.out.println("***********FLOYD'SALGORITHM**********"); 
		
		System.out.println("Enter the number of vertices: ");
		int n = in.nextInt();

		System.out.println("Enter the adjacency matrix"); 
		for (i=1;i<=n;i++)
			for (j=1;j<=n;j++) 
				a[i][j] = in.nextInt();

		System.out.println("Entered adjacency matrix is: "); 
		
		for(i=1;i<=n;i++) 
		{
			for(j=1; j<=n; j++) 
			{ 
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		floydalgo(a,n);

		System.out.println("All pair shortest path matrix:"); 
		
		for (i=1; i<=n; i++) 
		{
			for (j=1; j<=n; j++) 
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
		System.out.println("************ ********* **************");
	}
	
	static void floydalgo(int a[][],int n) 
	{ 
		for (int k=1; k<=n; k++) 
		{
			for (int i=1; i<=n; i++) 
				for (int j=1; j<=n; j++)
					a[i][j] = min(a[i][j], a[i][k] + a[k][j]);
		}
	}

	static int min(int a,int b) 
	{ 
		if(a>b)
			return b; 
		else
			return a;
	}
}

