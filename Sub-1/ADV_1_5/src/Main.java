import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
	LinkedList l = new LinkedList();
	Scanner s = new Scanner(System.in);
	System.out.println("Choices:");
	System.out.println("(1)Add");
	System.out.println("(2)Search and Produce subList");
	System.out.println("(3)Print List");
	System.out.println("(4)Print sublist");
	System.out.println("(5)Exit");
	System.out.println("Enter index for choice");
	int choice = s.nextInt();
	while(choice!=5)
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
		System.out.println("Enter element you want to search");
		l.searchElementProduceSublist(s.nextInt());
		break;
	}
	case 3:
	{
		l.printElements();
		break;
	}
	case 4:
	{
		l.printSubListElement();
	}
	default:
	{
		break;
	}
	
	}
	System.out.println("Choices:");
	System.out.println("(1)Add");
	System.out.println("(2)Search and Produce subList");
	System.out.println("(3)Print List");
	System.out.println("(4)Print sublist");
	System.out.println("(5)Exit");
	System.out.println("Enter index for choice");
	System.out.println("Enter choice index");
	choice = s.nextInt();
	}
}
}