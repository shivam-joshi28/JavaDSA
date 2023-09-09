//package LinkedList;
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

public class InsertAtGivenPosition 
{

    public static Node insert(Node head, int element,int position)
    {
        Node nodeToBeInserted = new Node(element);

        if(position == 0)
        {
            nodeToBeInserted.next = head;
            head = nodeToBeInserted;
            return nodeToBeInserted;
        }
        else
        {
             int count = 0;
             Node previous = head;
             while(count < position-1 && previous!= null)
             {
               count++;
               previous = previous.next;
             }
         if(previous!=null)
         {
         nodeToBeInserted.next = previous.next;
         previous.next = nodeToBeInserted;
         }
         return head;
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
public static void printList(Node head){
    //created current node and assign head to it
    Node current = head;
    //traversing the LL through while loop untill current becomes null and updating current 
    while(current!= null)
    {
        System.out.print(current.data + " ");
        current = current.next;
    }
}

    public static void main(String args[]){

        Node head = takingInput();
       head =  insert(head, 80, 0);
        printList(head);

    }
    
}
