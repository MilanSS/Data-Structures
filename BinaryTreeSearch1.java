
class BinaryTreeSearch1
{
 public enum State
 {
  Visited, Unvisited,Visiting;
 }
    static class Node
    {
        private int data;
        private Node left;
        private Node right;
        public Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
        public void setLeft(Node left)
        {
            this.left = left;
        }
        public void setRight(Node right)
        {
            this.right = right;
        }
        public Node getLeft()
        {
            return this.left;
        }        
        public Node getRight()
        {
            return this.right;
        }
        public int getData()
        {
            return this.data;
        }
        public boolean equals(Node n)
        {
            if(this.data ==(int) n.getData()) 
            	return true;
            else
                return false;
        }
    }
    public static void main(String[] args)
    {
        BinaryTreeSearch1 bts = new BinaryTreeSearch1();
        bts.run();
    }
   
    public void run()
    {
        Node root = new Node(10);
        insert(root,new Node(20));
        insert(root,new Node(5));
        insert(root,new Node(4));
        insert(root,new Node(5));
        insert(root,new Node(15));
         
        inOrderTraverse(root);
        System.out.println("\n" + binarySearch(root,new Node(10)));
    }
     
    public void insert(Node root, Node n)
    {
        if(root == null|| n == null) return;
         
        if(root.getData() > n.getData())
        {
            if(root.getLeft() == null)
            {
                root.setLeft(n);
                 System.out.println("Added node to left of "+root.getData()+" of value "+n.getData());            
            }
            else
            {
                insert(root.getLeft(),n);
            }
 
        }
        else if(root.getData() < n.getData())
        {
            if(root.getRight() == null)
            {
                root.setRight(n);
                System.out.println("Added node to Right of "+root.getData()+" of value "+n.getData());      
            }
            else
            {
                insert(root.getRight(),n);
            }
        }
    }
    
    public void inOrderTraverse(Node root)
    {
        if(root != null)
        {
            inOrderTraverse(root.getLeft());
            System.out.print("  "+root.getData());
            inOrderTraverse(root.getRight());
        }
         
    }
    
    public boolean binarySearch(Node root,Node n)
    {
        if(root == null || n == null) 
        {
            return false;
        }
        System.out.println("  \n Testing out "+root.getData()+" for value "+n.getData());
        if(root.getData() > n.getData())
        {
           return  binarySearch(root.getLeft(),n);
        }
        else if(root.getData() < n.getData())
        {
           return  binarySearch(root.getRight(),n);
        }
        return true;
    }
}