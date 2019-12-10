import java.util.Scanner;
class studentd 
{
    private String usn,name,branch,phone;
    public String getusn()
    {
    	return usn;
    }
    public String getname()
    {
    	return name;
    }
    public String getbranch()
    {
    	return branch;
    }
    public String getphone()
    {
    	return phone;
    }
    public studentd(String u,String n,String b,String p)
    {
    	usn=u;
    	name=n;
    	branch=b;
    	phone=p;
    }
}
    public class student
    {
    	public static void main(String[]args)
    	{
    		Scanner in=new Scanner(System.in);
    		System.out.println("Enter the number of students");
    		int m=in.nextInt();
    		studentd st[]=new studentd[m];
    		String u,n,b,p;
    		for(int i=0;i<m;i++)
    		{
    			System.out.println("Enter details of student "+(i+1));
    			System.out.println("USN :");
    			u=in.next();
    			System.out.println("Name :");
    			n=in.next();
    			System.out.println("Branch :");
    			b=in.next();
    			System.out.println("Phone :");
    			p=in.next();
    			st[i]=new studentd(u,n,b,p);
    		}
    		System.out.println("USN\tName\tBranch\tPhone\t");
    		for(int i=0;i<m;i++)
    		{
    			System.out.println(st[i].getusn()+"\t"+st[i].getname()+"\t"+st[i].getbranch()+"\t"+st[i].getphone());
    		}
    	}
    }