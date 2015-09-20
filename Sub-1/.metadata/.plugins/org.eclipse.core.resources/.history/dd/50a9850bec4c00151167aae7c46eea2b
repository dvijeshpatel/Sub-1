
public class Queue
{
private int front;
private int rear;
int flagPreviousOperation;
int size;
private int []queue =new  int[5];
int MAX_SIZE=5;
Queue()
{
	front=0;
	rear=0;
	size=0;
}
public int getFront()
{
	return this.front;
}
public int getRear()
{
	return this.rear;
}
public int getSize()
{
	return this.size;
}
public void enqueue(int data) {
	
	/*if(front==rear&&this.flagPreviousOperation==0)
	{
		System.out.println("Queue is Full");
	}
	else
	{
		queue[rear]=data;
		rear=(rear+1)%5;
		size++;
		this.flagPreviousOperation=0;
	}*/
	if(size==this.MAX_SIZE)
	{
		return;
	}
	queue[rear]	= data;
	
if(rear == (this.MAX_SIZE-1))
		rear=0;
	else
		rear++;
		size++;


  
}
public int dequeue(){
	/*if(front==rear&&(this.flagPreviousOperation==1||this.flagPreviousOperation==-1))
	{
		System.out.println("Queue is Empty");
		return 0;
	}
		else
	{
		int x = queue[front];
		front=(front+1)%5;
		size--;
		this.flagPreviousOperation=1;
		return x;
	}
	*/
	if(size==0)
		return -1000;
	else
	{
		int data = queue[front];
	if(front==(this.MAX_SIZE-1))
		front=0;
	else
		front++;
	
	size--;
	return data;
	}
		
}
public void printElements()
{
	/*if(this.flagPreviousOperation==-1)
	{
		System.out.println(" ");
		return;
	}
	int i,j;
	for(i=front,j=0;j<size;j++,i=(i+1)%5)
		System.out.print(queue[i]+" ");
	System.out.println(" ");*/
	for(int i=front,j=0;j<size;i++,j++)
	{
		if(i==this.MAX_SIZE)
			i=0;
		System.out.print(queue[i]+" ");
		
	}
}
public boolean empty()
{
	if(size==0)
		return true;
	return false;
}
}
