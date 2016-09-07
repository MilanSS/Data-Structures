
// Java program to find ceil of a given value in BST
 
class Node {
 
    int data;
    Node left, right;
 
    Node(int d) {
        data = d;
        left = right = null;
    }
}
 
class BSTFC {
 
    static Node root;
    int Ceil(Node node, int input) {
         
        if (node == null) {
            return -1;
        }
 
        if (node.data == input) {
            return node.data;
        }
 
        if (node.data < input) {
            return Ceil(node.right, input);
        }
 
        int ceil = Ceil(node.left, input);
        return (ceil >= input) ? ceil : node.data;
    }
     
    public static void main(String[] args) {
        BSTFC tree = new BSTFC();
        tree.root = new Node(10);
        tree.root.left = new Node(6);
        tree.root.right = new Node(14);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        tree.root.right.left = new Node(12);
        tree.root.right.right = new Node(18);
        for (int i = 0; i < 16; i++) {
            System.out.println(i + " " + tree.Ceil(root, i));
        }
    }
}
 
