
public class LinkedList
{
	Node head;
	Node tail;
public LinkedList()
{
	head = null;
	tail = null;
}
public void addElement(int data)
{
	 Node newNodeToAdd = new Node(data);
	 newNodeToAdd.setNextNode(null);
		if (isEmpty())
	            head = newNodeToAdd;
	        else
	            tail.setNextNode(newNodeToAdd);
	        tail = newNodeToAdd;
}



public void printElements()
{
	Node temp = head;
	while(temp!=null&&temp!=tail)
	{
		System.out.print(temp.getData()+" ");
		temp = temp.getNextNode();
	}
	if(tail!=null)
	System.out.print(tail.getData());
	System.out.println();
}
public boolean isEmpty() {
    return head==null;
}
public void reverseLinkedList()
{
	Node curr,temp,prev;
	prev=null;temp=null;
	curr=head;
	tail=head;
	
	while(curr!=null)
	{
		temp = curr.getNextNode();
		curr.setNextNode(prev);
		prev = curr;
		curr = temp;
	}
	head = prev;
}
}
