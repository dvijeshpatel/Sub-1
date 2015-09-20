
import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
	StackUsingTwoQueue st = new StackUsingTwoQueue();
	QueueUsingTwoStacks q = new QueueUsingTwoStacks();
	Scanner s = new Scanner(System.in);
	System.out.println("Choices:");
	System.out.println("(1)Stack\n(2)Queue");
	int c = s.nextInt();
	if(c==1)
	{
	System.out.println("(1)push");
	System.out.println("(2)pop");
	System.out.println("(3)Print");
	System.out.println("(4)Exit");
	System.out.println("Enter index for choice");
	int choice = s.nextInt();
	while(choice!=4)
	{
	switch(choice)
	{
	case 1:
	{
		System.out.println("Enter element you want to push");
		st.push(s.nextInt());
		break;
	}
	case 2:
	{
	int temp = st.pop();
	if(temp!=-1000)
		System.out.print(temp+" ");
	break;
	}
	case 3:
	{
		st.print();
		break;
	}
	default:
	{
		break;
	}
	
	}
	System.out.println("Choices:");
	System.out.println("(1)push");
	System.out.println("(2)pop");
	System.out.println("(3)Print");
	System.out.println("(4)Exit");
	System.out.println("Enter index for choice");
	System.out.println("Enter choice index");
	choice = s.nextInt();
	}
	}
	if(c==2)
	{
			System.out.println("(1)Enque");
			System.out.println("(2)Dequeue");
			System.out.println("(3)Print");
			System.out.println("(4)Exit");
			System.out.println("Enter index for choice");
			int choice = s.nextInt();
			while(choice!=4)
			{
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter element you want to Enqueue");
				q.enqueue(s.nextInt());
				break;
			}
			case 2:
			{
				q.dequeue();
				break;
			}
			case 3:
			{
				q.print();
				break;
			}
			default:
			{
				break;
			}
			
			}
			System.out.println("Choices:");
			System.out.println("(1)Enqueue");
			System.out.println("(2)Dequeue");
			System.out.println("(3)Print");
			System.out.println("(4)Exit");
			System.out.println("Enter index for choice");
			System.out.println("Enter choice index");
			choice = s.nextInt();
			}
}
}
}
