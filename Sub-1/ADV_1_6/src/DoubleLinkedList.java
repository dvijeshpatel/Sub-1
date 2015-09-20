
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
		System.out.println();
}
public boolean isEmpty() {
    return head==null;
}
public void reverseLinkedList(int start,int end)
{
Node startNode = head;
	Node endNode = head;
	for(int i=1;i<start;i++)
	{
		startNode=startNode.getNextNode();
	}
	for(int i=1;i<end;i++)
	{
		endNode=endNode.getNextNode();
	}
	Node pre = startNode.getPrevNode();
	Node nex = endNode.getNextNode();
	Node temp1 = startNode;
	for(int i=0;i<=(end-start);i++)
	{
		Node temp2 = temp1.getNextNode();
		temp1.setNextNode(temp1.getPrevNode());
		temp1.setPrevNode(temp2);
		temp1 = temp2;
	}
	Node t = startNode.getNextNode();
	startNode.setNextNode(endNode.getPrevNode());
	endNode.setPrevNode(t);
	if(start==1)
		head = endNode;
	else
	pre.setNextNode(endNode);
	if(end==size)
		tail=startNode;
	else
	nex.setPrevNode(startNode);
}
}
