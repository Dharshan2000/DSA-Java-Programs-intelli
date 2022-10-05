
class Node
{
    char key;
    Node left,right;
    Node(char key)
    {
        this.key=key;
    }
}
class TreeTraversal
{
    Node root;
    void preorder(Node n)
    {
        if(n!=null)
        {
            System.out.print(n.key+" ");
            preorder(n.left);
            preorder(n.right);
        }
    }
    void postorder(Node n)
    {
        if(n!=null)
        {

            preorder(n.left);
            preorder(n.right);
            System.out.print(n.key+" ");
        }
    }
    void inorder(Node n)
    {
        if(n!=null)
        {
            preorder(n.left);
            System.out.print(n.key+" ");
            preorder(n.right);
        }
    }
}




public class Traversal {
    public static void main(String args[])
    {
        TreeTraversal t1=new TreeTraversal();
        t1.root=new Node('A');
        t1.root.left=new Node('B');
        t1.root.right=new Node('C');
        t1.root.left.left=new Node('D');
        t1.root.left.right=new Node('E');
        t1.preorder(t1.root);
        System.out.println();
        t1.inorder(t1.root);
        System.out.println();
        t1.postorder(t1.root);
    }
}
