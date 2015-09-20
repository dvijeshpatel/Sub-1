
public class QueueUsingTwoStacks 
{
	 private Stack stack1 = new Stack();
	    private Stack stack2 = new Stack();
		private int flag=-1;
	    public void enqueue(int d) {
	        while(!stack2.isEmpty())
	            stack1.push(stack2.pop());
	        stack1.push(d);
	        flag=0;
	    }

	    public int dequeue() {
	    	flag=1;
	    	if(stack1.isEmpty())
	    		System.out.println("No element");
	        while(!stack1.isEmpty())
	            stack2.push(stack1.pop());
	        if(!stack2.isEmpty())
	            return stack2.pop();
	        else
	            return 0;
	    }
	    public void print()
	    {
	    	if(flag==0)
	    		stack1.printElements();
	    	if(flag==1)
	    	{
	    		Stack temp = new Stack();
	    		while(!stack2.isEmpty())
	    		{
	    			temp.push(stack2.pop());
	    		}
	    		temp.printElements();
	    		while(!temp.isEmpty())
	    		{
	    			stack2.push(temp.pop());
	    		}
	    	}
	    }
}
