class Stack {
    private int []stack = new int[5];
    private int top = -1;

    public boolean isEmpty() {
        if (top== -1) return true;
        return false;
    }

    public int peek() {
        if (!this.isEmpty()) return stack[top];
        else
        {
        	System.out.println("Stack is Empty");
        	return 0;
        }
        
    }

    public void push(int data) {
        top++;
        if(top==5)
        	{
        	System.out.println("Stack if full");
        	top--;
        	}
        else
        {
        	 stack[top] = data;
        }
    }

    public int pop() {
        if (this.isEmpty()) return 0;
        return stack[top--];
    }

    public void search(int key) {
        if (this.isEmpty())
        	{
        	System.out.println("Stack is Empty");
        //	return 0;
        	};
        for (int i = 0; i < top; i++)
            if (stack[i] == key) System.out.println(i+1) ;
    }
    public void printElements()
    {
    	for(int i=0;i<=top;i++)
    		System.out.print(stack[i]+" ");
    	System.out.println(" ");
    }
}