class Mystack
{
    int arr[];          // array to store values put in stack
    int cap;            // capacity
    int top;            // top of the stack 
    //Constructor
    Mystack(int c)
    {
        top = -1;             // intially top is -1 i.e. stack is Empty
        cap = c;                // whatever we provide data as c is capacity of the stack 
        arr = new int[cap];     // array declaration

    }
    //
    // To push the element in the stack
    void push(int x)
    {   
        if (top == (cap-1))
        {
            System.out.println("Stack is overflow");
        }
        else{
            arr[++top]= x;           // first we increment the top and then put the element to the arr[top] 
            System.out.println(x+ " Pushed into stack ");
        }
    }
    int pop()
    {
        if(top== -1){
            System.out.println("Stack is underflow");
            return 0;
        }
        else
        {   
            int res = arr[top];
            top--;                  // to pop out the element we simply decremnt the top 
             return res;
        }
      
     
    }

    int size()
    {
        return top+1;       // size is just top+1
    }
    boolean isEmpty()
    {
        return (top == -1);     // to check the stack is empty or not

    }


    public static void main(String args[])
    {
     Mystack s = new Mystack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}

