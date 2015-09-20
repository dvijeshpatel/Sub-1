
public class Node
{
private int data;
private Node nextNode;
private Node prevNode;
public static int total=0;
public Node(int data)
{
	this.data = data;
	this.nextNode=null;
	this.prevNode=null;
}
public Node()
{
	this.nextNode=null;
	this.prevNode=null;
}
public Node(Node n)
{
	this.data=n.getData();
	this.setNextNode(n.getNextNode());
	this.setPrevNode(n.getPrevNode());
}
public int getData()
{
	return this.data;
}
public void setData(int data)
{
	this.data = data;
}

public Node getPrevNode()
{
	return this.prevNode;
}
public Node getNextNode()
{
	return this.nextNode;
}
public void setNextNode(Node nextNode)
{
	this.nextNode= nextNode;
}
public void setPrevNode(Node prevNode)
{
	this.prevNode=prevNode;
}
}
