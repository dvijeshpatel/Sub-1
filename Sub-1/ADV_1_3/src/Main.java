import java.util.*;
public class Main {

	public static void main(String args[])
	{
			Scanner s = new Scanner(System.in);
			Stack st = new Stack();
			Queue ls = new LinkedList();
			System.out.println("(1)Queue");
			System.out.println("(2)Stack");
		int c = s.nextInt();
			if(c==2)
			{
			System.out.println("Choices:");
			System.out.println("(1)push");
			System.out.println("(2)pop");
			System.out.println("(3)Exchange two element of stack");
			System.out.println("(4)Reverse SubRoutine");
			System.out.println("(5)Print");
			System.out.println("(6)Exit");
			System.out.println("Enter index for choice");
			int choice = s.nextInt();
			while(choice!=6)
			{
			switch(choice)
			{
			case 1:
			{
				st.push(s.nextInt());
				break;
			}
			case 2:
			{
				System.out.println(st.pop());
				break;
			}
			case 3:
			{
				System.out.println("Enter two indexes");
				 exchangeTwoElementsStack(st,s.nextInt(),s.nextInt());
				break;
			}
			case 4:
			{
				reverseSubRoutineStack(st,s.nextInt(),s.nextInt());
				break;
			}
			case 5:
			{
				for(int i=0;i<st.size();i++)
				{
					System.out.print(st.elementAt(i)+" ");
				}
				break;
			}
			default:
			{
				System.exit(0);
				break;
			}
			
			}
			System.out.println("Choices:");
			System.out.println("(1)push");
			System.out.println("(2)pop");
			System.out.println("(3)Exchange two element of stack");
			System.out.println("(4)Reverse SubRoutine");
			System.out.println("(5)Print");
			System.out.println("(6)Exit");
			System.out.println("Enter index for choice");
			choice = s.nextInt();
			}
			}
			if(c==1)
			{
				System.out.println("Choices:");
				System.out.println("(1)Enque");
				System.out.println("(2)Dequeue");
				System.out.println("(3)Exchange two element of stack");
				System.out.println("(4)Reverse SubRoutine");
				System.out.println("(5)Print");
				System.out.println("(6)Exit");
				System.out.println("Enter index for choice");
				int choice = s.nextInt();
				while(choice!=6)
				{
				switch(choice)
				{
				case 1:
				{
					ls.add(s.nextInt());
					break;
				}
				case 2:
				{
					System.out.println(ls.remove());
					break;
				}
				case 3:
				{
					System.out.println("Enter two indexes");
					 exchangeTwoElementsQueue(ls,s.nextInt(),s.nextInt());
					break;
				}
				case 4:
				{
					reverseSubListQueue(ls,s.nextInt(),s.nextInt());
					break;
				}
				case 5:
				{
						System.out.print(ls.toString()+" ");
					break;
				}
				default:
				{
					System.exit(0);
					break;
				}
				}
				System.out.println("Choices:");
				System.out.println("(1)Enque");
				System.out.println("(2)Dequeue");
				System.out.println("(3)Exchange two element of stack");
				System.out.println("(4)Reverse SubRoutine");
				System.out.println("(5)Print");
				System.out.println("(6)Exit");
				System.out.println("Enter index for choice");
				choice = s.nextInt();
				}
				}
			}
	
public static void exchangeTwoElementsStack(Stack s,int ind1,int ind2)
	{
		Stack temp1 = new Stack();
		Stack temp2 = new Stack();
		int t1 = s.size();
		for(int i=0;i<((t1-ind2)+1);i++)
		{
			temp1.push(s.pop());
		}
		t1 = s.size();
		for(int i=0;i<((t1-ind1)+1);i++)
		{
			temp2.push(s.pop());
		}
		s.push(temp1.pop());
		temp1.push(temp2.pop());
		while(!temp2.isEmpty())
		{
			s.push(temp2.pop());
		}
		while(!temp1.isEmpty())
		{
			s.push(temp1.pop());
		}
	}
	public static void reverseSubRoutineStack(Stack s,int ind1,int ind2)
	{
		Stack temp1 = new Stack();
		Stack temp2 = new Stack();
		int t1 = s.size();
		for(int i=0;i<(t1-ind2);i++)
		{
			temp1.push(s.pop());
		}
		t1 =s.size();
		for(int i=0;i<(t1-ind1+1);i++)
		{
			temp2.push(s.pop());
		}
		while(!temp2.isEmpty())
		{
			temp1.push(temp2.pop());
		}
		while(!temp1.isEmpty()){
			s.push(temp1.pop());
		}
	}
	public static void exchangeTwoElementsQueue(Queue q,int ind1,int ind2)
	{
		Queue q1 = new LinkedList();
		Queue q2 = new LinkedList();
		for(int i=1;i<ind1;i++)
		{
			q1.add(q.remove());
		}
		for(int i=0;i<(ind2-ind1);i++)
		{
			q2.add(q.remove());
		}
		int temp = (Integer) q2.remove();
		q2.add(temp);
		q1.add(q.remove());
		while(!q2.isEmpty())
		{
			q1.add(q2.remove());
		}
		while(!q.isEmpty())
		{
			q1.add(q.remove());
		}
		while(!q1.isEmpty())
		{
			q.add(q1.remove());
		}
	}
	public static void reverseSubListQueue(Queue q,int ind1,int ind2)
	{
		Queue q1 = new LinkedList();
		Queue q2 = new LinkedList();
		for(int i=1;i<ind1;i++)
		{
			q1.add(q.remove());
		}
		for(int i=0;i<(ind2-ind1+1);i++)
		{
		q2.add(q.remove());
		}
		int t = q2.size();
		for(int i=0;i<t;i++)
		{
			int t2 = q2.size();
		for(int j=1;j<t2;j++)
		{
			q2.add(q2.remove());
		}
		q1.add(q2.remove());
		}
		while(!(q.isEmpty()))
		{
			q1.add(q.remove());
		}
		while(!q1.isEmpty())
		{
			q.add(q1.remove());
		}
	}
}
	

	