//Class for DLL
public class DLL{
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
        /* 4. Change the head's previous as the new_Node.*/
       if(head!=null){
         head.prev=new_Node;
       }
       /* 5. Move the head to point to the new_Node.*/
       head=new_Node;
     }
     //Adding a node before the given node.
       public void InsertBefore(Node next_node, int new_data){
         /* Check if the given next_node is NULL.*/
         if(next_node==null){
           System.out.println("The given next node can not be NULL.");
           return;
         }
         /* 1. Allocate Node.
     * 2. Put in the data.*/
         Node new_Node = new Node(new_data);
         /* 3. Make previous of new_Node as previous of next_node.*/
         new_Node.prev=next_node.prev;
         /* 4. Make next of new_Node as next_node.*/
         new_Node.next=next_node;
         /* 5. Make previous node of next_node as new_Node.*/
         next_node.prev=new_Node;
         /* 6. Check if new node is added as head.*/
         if(new_Node.prev!=null){
         new_Node.prev.next=new_Node;
         }else{
           head=new_Node;
         }
       }
      //Adding a node after the given node.
         public void InsertAfter(Node prev_node, int new_data){
          /* 1.Check if the given previous node is NULL.*/
           if(prev_node==null){
             System.out.println("The given previous node can not be NULL.");
             return;
           }
           /* 2. Allocate Node.
     * 3. Put in the data.*/
           Node new_Node = new Node(new_data);
           /* 4. Make next of new_Node as next of prev_node.*/
           new_Node.next=prev_node.next;
           /* 5. Make previous of new_Node as prev_node.*/
           new_Node.prev=prev_node;
           /* 6. Make next of prev_node as new_Node.*/
           prev_node.next=new_Node;
           /* 7. Check if the node is added in the last of the list.*/
           if(new_Node.next!=null){
             new_Node.next.prev=new_Node;
           }
         }
}
           
           
         
