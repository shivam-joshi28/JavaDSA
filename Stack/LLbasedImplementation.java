//package Stack;

public class LLbasedImplementation {
    
    class Node
    {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

   
        Node head = null;
        int size = 0;
        int size()
        {
            return size;
        }
        
        boolean isEmpty(){
            return (head== null);
        }

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
            System.out.println(x+" push into stack");
        }

        int pop(){
            if(head==null)
            {
                System.out.println("stack underflow");
            }
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }
        int peek()
        {
            if(head==null)
            {
                System.out.println("Stack Empty");

            }
            return head.data;
        }


    
    public static void main(String args[])
    {
        LLbasedImplementation s = new LLbasedImplementation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}
