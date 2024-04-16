  

//creating Node class to create Node of Linkedlist

class Node
{
    int data;
    Node next;

    //constructor of Node class
    Node(int x){
        data = x;
        next = null;
    }
}


public class TraversingLinkedList {
    public static void main(String args[]) 
    {
       // creating first node of LL as Head Node and then second, third and fourth
       Node head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);
       head.next.next.next =  new Node(40);
       
       printList(head);     // function to printList
    }

    //sending head node as reference to the function printList
 
}

