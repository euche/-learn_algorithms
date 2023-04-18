package AVLtree;

public class InvertBinaytree {

    // Question, Invert a Binary tree.
    //Solution
    Node root;

    void invert(){
        root = invert(root);
    }

    public Node invert(Node r) {
        // base condition
        if(r == null){
            return r;
        }
        // recursive calls
        Node left = invert(r.left);
        Node right = invert(r.right);

        // swap left and right;
        r.left = right;
        r.right = left;
        return r;

    }

    void print_tree(){
        print_tree(root);
    }

    public void print_tree(Node node) {
        // base condition
        if(node == null){
            return ;
        }

        print_tree(node.left);
        System.out.print(node.data + " ");
        print_tree(node.right);

    }
    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        InvertBinaytree tree = new InvertBinaytree();
        tree.root = new Node(2);
        tree.root.left = new Node(1);
        tree.root.right = new Node(4);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(5);

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        tree.print_tree();
        System.out.println("");

        /* invert tree */
        tree.invert();

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.print_tree();

    }

}

class Node{
    int data;
    Node left,right;

    public Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
}
