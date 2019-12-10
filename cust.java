import java.util.StringTokenizer;
import java.util.Scanner;
class customer
{
	String name,dob;
	public customer(String n, String d)
	{
		name=n;
		dob=d;
	}
	public void displaydata()
	{
		StringTokenizer st=new StringTokenizer(dob,"/");
		System.out.print(name);
		while(st.hasMoreTokens())
			System.out.print(","+st.nextToken());
	}
}
public class cust 
{
  public static void main(String[]args)
  {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter name :");
	  String name=in.nextLine();
	  System.out.println("Enter date of birth in dd/mm/yyyy format : ");
	  String dob=in.next();
	  customer cust=new customer(name,dob);
	  cust.displaydata();
  }
}
