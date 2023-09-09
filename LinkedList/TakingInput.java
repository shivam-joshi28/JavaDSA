 import java.util.Scanner;
 
 class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}


public class TakingInput
{

        public static void main(String[] args) 
     {
      Node head = takingInput();
         print(head);
    
     }
    public static void print(Node head)
    {
        Node current = head;
        while(current!= null)
        {
            System.out.print(current.data+ "-->");
            current = current.next;
        }
    }
    public static Node takingInput() 
    {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node head = null, tail = null;
        while(data!= -1)
        {
            Node currentNode = new Node(data);
         if(head == null)
         {
            head = currentNode;
            tail = currentNode;
         }
        else
        {
         tail.next = currentNode;
         tail = currentNode; 
        }
            data = s.nextInt();
    }
        return head;
}
 
}