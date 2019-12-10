import java.util.Scanner;
public class krushkal 
{
   static int parent[]=new int[10],cost[][]=new int[10][10];
   static int a,b,i,j,u,v,n,min,noe=1,mincost=0;
   static int find(int w)
   {
	   while(parent[w]!=0)
		   w=parent[w];
	   return w;
   }
   static void union()
   {
	   if(u!=v)
	   {
		   noe++;
		   System.out.println((noe-1)+" edge ( "+a+","+b+" ) = "+min);
		   mincost+=min;
		   parent[v]=u;
	   }
	   cost[a][b]=cost[b][a]=999;
   }
   public static void main(String[] args)
   {
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the number of nodes");
	   int n=in.nextInt();
	   System.out.println("Enter the cost matrix");
	   for(int i=1;i<=n;i++)
		   for(int j=1;j<=n;j++)
			   cost[i][j]=in.nextInt();
	   while(noe<n)
	   {
		   min=999;
		   for(int i=1;i<=n;i++)
		   {
			   for(int j=1;j<=n;j++)
			   {
				   if(cost[i][j]<min)
				   {
					   min=cost[i][j];
					   a=u=i;
					   b=v=j;
				   }
			   }
		   }
		   u=find(u);
		   v=find(v);
		   union();
	   }
	   System.out.println("Minimum cost = "+mincost);
   }
}
