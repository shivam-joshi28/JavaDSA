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

public class DeletNode{


    public static Node deleted (Node head,int element, int position){

        Node previous = head;
        int count = 0;
        while(count< position-1 && currentNode!=null){
            previous = previous.next;
            count++;
        }
        previous.next = previous.next.next;
        return head;

    }
    public static Node takingInput() 
    {
        System.out.print("Enter elements of array and to end list pls write -1 :");
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to be deleted: ");
        int element = sc.nextInt();
        System.out.print("Enter a position: ");
        int position = sc.nextInt();
       head =  deleted(head, element, position);
        printList(head);

    }
}