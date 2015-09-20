
public class StackUsingTwoQueue 
{
	Queue queue1;
	Queue queue2;
	StackUsingTwoQueue()
	{
   queue1 = new Queue();
   queue2 = new Queue();
	}
	public void push(int data)
	{
		if(queue1.getSize()==queue1.MAX_SIZE)
			{
			System.out.println("Full storage");
			return;
			}
		queue1.enqueue(data);
		
	}
	public int pop()
	{
	
		/*while(queue1.getFront()!=queue1.getRear())
			queue2.enqueue(queue1.dequeue());
		int temp = queue1.dequeue();
		while(!queue2.empty())
			queue1.enqueue(queue2.dequeue());
		return temp;*/
		if(queue1.size==0)
			return -1000;
		int t = queue1.getSize();
		for(int i=0;i<(t-1);i++)
		{ 
			int temp = queue1.dequeue();
			if(temp!=-1000)
			queue2.enqueue(temp);
		}
		int temp = queue1.dequeue();
		int t2 = queue2.getSize();
		for(int i=0;i<t2;i++)
			queue1.enqueue(queue2.dequeue());
		return temp;
			
	}
	public void print()
	{
		queue1.printElements();
	}
}
