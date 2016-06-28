
// program: Merge two sorted linked list such that merged list is in reverse order.
 
class Sortedmerge {
 
    Node head;  
    static Node a, b;
 
    static class Node 
    {
 
        int data;
        Node next;
        Node(int d) 
        {
            data = d;
            next = null;
        }
    }
 
    void printlist(Node node) 
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    Node Sortedmergell(Node node1, Node node2) 
    {
        if (node1 == null && node2 == null)
        {
            return null;
        }
 
        Node res = null;
 
        while (node1 != null && node2 != null) 
        {
                if (node1.data <= node2.data) 
            {
                Node temp = node1.next;
                node1.next = res;
                res = node1;
                node1 = temp;
            } 
                else
            {
                Node temp = node2.next;
                node2.next = res;
                res = node2;
                node2 = temp;
            }
        }
 
        while (node1 != null) 
        {
            Node temp = node1.next;
            node1.next = res;
            res = node1;
            node1 = temp;
        }
 
        while (node2 != null) 
        {
            Node temp = node2.next;
            node2.next = res;
            res = node2;
            node2 = temp;
        }
 
        return res;
    }
    public static void main(String[] args) {
 
        Sortedmerge list = new Sortedmerge();
        Node result = null;
 
        Sortedmerge.a = new Node(15);
        Sortedmerge.a.next = new Node(20);
        Sortedmerge.a.next.next = new Node(25);
 
        Sortedmerge.b = new Node(5);
        Sortedmerge.b.next = new Node(8);
        Sortedmerge.b.next.next = new Node(18);
 
        System.out.println("List a before merge :");
        list.printlist(a);
        System.out.println("");
        System.out.println("List b before merge :");
        list.printlist(b);
 
        result = list.Sortedmergell(a, b);
        System.out.println("");
        System.out.println("Merged linked list : ");
        list.printlist(result);
 
    }
}
 

