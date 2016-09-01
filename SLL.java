
// Java program to select a random node from singly linked list
 
import java.util.*;
 

class SLL {
 
    static Node head;  
 
   
    static class Node {
 
        int data;
        Node next;
 
        
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    
    void printrandom(Node node) {
 
        
        if (node == null) {
            return;
        }
 
       
        Math.abs(UUID.randomUUID().getMostSignificantBits());
 
       
        int result = node.data;
 
       
        Node current = node;
        int n;
        for (n = 2; current != null; n++) {
 
           
            if (Math.random() % n == 0) {
                result = current.data;
            }
 
            
            current = current.next;
        }
 
        System.out.println("Randomly selected key is " + result);
    }
 
   
    public static void main(String[] args) {
 
        SLL list = new SLL();
        list.head = new Node(15);
        list.head.next = new Node(2);
        list.head.next.next = new Node(14);
        list.head.next.next.next = new Node(30);
        list.head.next.next.next.next = new Node(80);
 
        list.printrandom(head);
 
    }
}
 
