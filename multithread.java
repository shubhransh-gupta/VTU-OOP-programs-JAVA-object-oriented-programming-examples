import java.util.Random;
class random extends Thread
{
	public void run()
	{
		Random rand;
		int i=0,m;
		do
		{
			rand=new Random();
			m=rand.nextInt(100);
			System.out.println(m+" ");
			i++;
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}while(i<10);
	}
}
class square extends Thread
{
	int n;
	public void run()
	{
		System.out.println("Square of a number "+this.n+" is : "+Math.pow(this.n,2));
	}
	public square(int a)
	{
		this.n=a;
	}
}
class cube extends Thread
{
	int n;
	public void run()
	{
		System.out.println("Cube of a number "+this.n+" is : "+Math.pow(this.n,3));
	}
	public cube(int a)
	{
		this.n=a;
	}
}
public class multithread 
{
  public static void main(String[]args)
  {
	  Thread t1=new random();
	  t1.start();
	  Thread t2=new square(7);
	  t2.start();
	  Thread t3=new cube(5);
	  t3.start();
  }
}
