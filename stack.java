import java.util.Scanner;
class stackdemo
{
	int capacity=3;
	int arr[]=new int[capacity];
	int top=-1;
	public void push(int ele)
	{
		if(top<capacity-1)
		{
			top++;
			arr[top]=ele;
			System.out.println("Element "+ele+" is pushed into stack");
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}
	public void pop()
	{
		if(top>=0)
		{
			top--;
			System.out.println("Pop creation is successfull and element is "+arr[top+1]);
		}
		else
			System.out.println("Stack underflow");
	}
	public void display()
	{
		if(top>=0)
		{
			System.out.println("Elements in stack are : ");
			for(int i=top;i>=0;i--)
				System.out.println(arr[i]);
		}
		else
			System.out.println("Stack is empty");
	}
}
public class stack 
{
    public static void main(String[]args)
    {
    	stackdemo sd=new stackdemo();
    	Scanner in=new Scanner(System.in);
    	while(true)
    	{
    		System.out.println("Enter your choice");
    		System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n");
    		int choice =in.nextInt();
    		switch(choice)
    		{
    		   case 1: System.out.println("Enter the number to be pushed");
    		           int num=in.nextInt();
    		           sd.push(num);
    		           break;
    		   case 2: sd.pop();
    		   break;
    		   case 3: sd.display();
    		   break;
    		   case 4: System.exit(0);
    		   default: System.out.println("Invalid choice!!!");
    		}
    	}
    }
}
