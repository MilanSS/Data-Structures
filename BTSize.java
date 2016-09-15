// Java program to calculate the size of the tree

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BTSize
{
    Node root;
 
    int size()
    {
        return size(root);
    }
 
    int size(Node node)
    {
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }
 
    public static void main(String args[])
    {
        BTSize tree = new BTSize();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The size of binary tree is : "
                            + tree.size());
    }
}
