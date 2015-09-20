
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
