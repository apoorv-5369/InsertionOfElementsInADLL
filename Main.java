//Class for DLL
public class DLLP
  Node head; // Head of the list.
  /* Doubly Linked List node.*/
  class Node{
  int data;
  Node prev, next;
  // Constructor to create a new node.
  // next and prev are initialized as NULL.
     Node (int d){data = d;}
     }
     // Addding a node at the front of the list.
     public void push(int new_data)
     {
     /* 1. Allocate Node.
     * 2. Put in the data.*/
        Node new_Node = new Node(new_data);
        /* 3. Make next of the new_Node as head and previous as NULL.*/
        new_Node.next=head;
        mew_Node.prev=null;
        /* 4. Change the head'
