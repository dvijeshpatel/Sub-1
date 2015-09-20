
public class DoubleLinkedList
{
	Node head;
	Node tail;
	int size;
	Node[] arr = new Node[100];
public DoubleLinkedList()
{
	head = new Node();
	tail = new Node();
	size=0;
}
public void addElement(int data)
{
Node temp = new Node(data);
if(size==0)
{
	head=temp;
	tail=temp;
	arr[size] = temp;
	size++;
}
else
{	
	tail.setNextNode(temp);
	temp.setPrevNode(tail);
	tail =temp;
	arr[size]=temp;
	size++;
}
}


public void printElements()
{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp = temp.getNextNode();
		}
		//if(tail!=null)
	//	System.out.print(tail.getData());
		System.out.println();
	
}
public boolean isEmpty() {
    return head==null;
}
public void rerversrList(int indexes[])
{
	int start=0;
	int end = indexes.length-1;
while(start<=end)
{
	Node startNode = head;
	Node endNode = head;
	
	for(int i=1;i<indexes[start];i++)
	{
		startNode=startNode.getNextNode();
	}
	for(int i=1;i<indexes[end];i++)
	{
		endNode=endNode.getNextNode();
	}
	Node first = new Node(startNode);
	Node last = new Node(endNode);
endNode.getPrevNode().setNextNode(first);
if(endNode!=tail)	endNode.getNextNode().setPrevNode(first);
else tail =first;
first.setNextNode(endNode.getNextNode());
	first.setPrevNode(endNode.getPrevNode());
	endNode=null;
if(startNode!=head)	startNode.getPrevNode().setNextNode(last);
else head= last;
	startNode.getNextNode().setPrevNode(last);
	last.setNextNode(startNode.getNextNode());
	last.setPrevNode(startNode.getPrevNode());
	startNode=null;
	start++;
	end--;
}
}
}
