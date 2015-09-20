import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
	DoubleLinkedList l = new DoubleLinkedList();
	Scanner s = new Scanner(System.in);
	System.out.println("Choices:");
	System.out.println("(1)Add");
	System.out.println("(2)Reverse LinkedList");
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
		System.out.println("Enter element you want to add");
		l.addElement(s.nextInt());
		break;
	}
	case 2:
	{
		System.out.println("How many Elements to revese");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter indexes of Elemets");
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		l.rerversrList(arr);
		break;
	}
	case 3:
	{
		l.printElements();
		break;
	}
	default:
	{
		System.exit(0);
		break;
	}
	
	}
	System.out.println("Choices:");
	System.out.println("(1)Add");
	System.out.println("(2)Reverse LinkedList");
	System.out.println("(3)Print");
	System.out.println("(4)Exit");
	System.out.println("Enter index for choice");
	System.out.println("Enter choice index");
	choice = s.nextInt();
	}
	
}
}