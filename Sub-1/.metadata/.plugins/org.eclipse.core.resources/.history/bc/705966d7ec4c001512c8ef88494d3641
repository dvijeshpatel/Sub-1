
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
public void reverseLinkedList(int start,int end)
{
	/*if(start==1&&end==size)
	{
		Node temp = head;
		while(temp!=null)
		{
			Node temp1 = temp.getNextNode();
			temp.setNextNode(temp.getPrevNode());
			temp.setPrevNode(temp1);
			temp = temp1;
		}
		temp = tail;
		tail  = head;
		head = temp;
	}
	else
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
	int flag=0;
	while(startNode!=endNode)
	{
		Node temp1 = startNode.getPrevNode();
		Node temp2 = startNode.getNextNode();
		Node temp3 = endNode.getPrevNode();
		Node temp4 = endNode.getNextNode();
		startNode.setPrevNode(temp3);
		startNode.setNextNode(temp4);
		endNode.setPrevNode(temp1);
		endNode.setNextNode(temp2);
	if(temp1!=null)	temp1.setNextNode(endNode);
	if(temp4!=null)temp4.setPrevNode(startNode);
		temp2.setPrevNode(endNode);
		temp3.setNextNode(startNode);
		startNode = temp2;
		endNode = temp3;
		if((startNode.getNextNode()==endNode&&endNode.getPrevNode()==startNode))
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
	Node temp1 = startNode.getPrevNode();
	Node temp2 = startNode.getNextNode();
	Node temp3 = endNode.getPrevNode();
	Node temp4 = endNode.getNextNode();
	startNode.setPrevNode(temp3);
	startNode.setNextNode(temp4);
	endNode.setPrevNode(temp1);
	endNode.setNextNode(temp2);
	temp1.setNextNode(endNode);
	temp4.setPrevNode(startNode);
	temp2.setPrevNode(endNode);
	temp3.setNextNode(startNode);
	}
	if(flag==1)
	{
		Node temp1 = startNode.getPrevNode();
		Node temp2 = endNode.getNextNode();
		startNode.setNextNode(temp2);
		startNode.setPrevNode(endNode);
		endNode.setPrevNode(temp1);
		endNode.setNextNode(startNode);
		temp1.setNextNode(endNode);
		temp2.setPrevNode(startNode);
	}
	}*/
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
/*	if(start==1)
		startNode.setNextNode();
	pre.setNextNode(endNode);
	endNode.setPrevNode(pre);
	nex.setPrevNode(startNode);
	startNode.setNextNode(nex);*/
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
