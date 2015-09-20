
public class LinkedList
{
	Node head;
	Node tail;
	Node subhead;
	Node subtail;
public LinkedList()
{
	head = null;
	tail = null;
	this.subhead=null;
	this.subtail=null;
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
public Node searchElementProduceSublist(int key)
{
	Node temp = head;
	int index=1;
	int flag=0;
	
		while(temp!=null)
		{
			if(temp.getData()==key)
			{
			temp.setNextNode(temp.getNextNode());
			System.out.println("index is "+ index);
			flag=1;

			 Node newNodeToAdd = new Node(key);
			 newNodeToAdd.setNextNode(null);
				if (subhead==null)
			            subhead = newNodeToAdd;
			        else
			            subtail.setNextNode(newNodeToAdd);
			        subtail = newNodeToAdd;			
			 }
			index++;
		temp = temp.getNextNode();
		}
		if(flag==0)System.out.println("Element not Found");
		return subhead;

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
public void printSubListElement()
{

	Node temp = subhead;
	while(temp!=null&&temp!=subtail)
	{
		System.out.print(temp.getData()+" ");
		temp = temp.getNextNode();
	}
	if(subtail!=null)
	System.out.print(subtail.getData());
	System.out.println();

}
public boolean isEmpty() {
    return head==null;
}
}

