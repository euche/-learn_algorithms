package AVLtree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeLL {

    BBinaryNode root;

    // we create a Binary tree, by creating its constructor.-> Create root node and set it to null;
    public BinaryTreeLL(BBinaryNode root) {
        this.root = null;
    }

    public BinaryTreeLL() {
    }

    // pre-order traversal

    void preorder(BBinaryNode node) {
        if (node == null) {  // if we reach the deepest leaf, this piece of code stops the recursive nature.
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);

    }

    // in - order traversal
    void inOrder(BBinaryNode node) {
        if (node == null) { // base condition
            return;
        }
        inOrder(node.left);             // visit leftsubtree-> then rootnode-> then rightsubtree
        System.out.print(node.value + " ");
        inOrder(node.right);

    }

    //  post-order traversal
    void postOrder(BBinaryNode node) {
        if (node == null) { // base condition
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");

    }

    //Level order
    void levelOrder() {

        Queue<BBinaryNode> queue = new LinkedList<BBinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()) {    // first create a node to save current node in queue
            BBinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");  // then if the left child of presentNode is not null
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {         // then do the same for right node
                queue.add(presentNode.right);
            }
        }


    }

    public void searchMethod(String value) {

        Queue<BBinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BBinaryNode currNode = queue.remove();
            if (currNode.value == value) {
                System.out.println("The value-" + value);
                return;
            } else {
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }

        }
        System.out.println("The value-" + value + "is not found");
    }    // check for other implementations of search method in  binary tree.


    // insert node method
    void insertNode(String value) {
        BBinaryNode newNode = new BBinaryNode();
        newNode.value = value;
        if (root == null) {  // First option; if the rootnode is null
            root = newNode;
            System.out.println("Inserted new node at root");
            return;

        }
        // Second option; look for a vacant place in the binary tree..

        Queue<BBinaryNode> queue = new LinkedList<BBinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BBinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {                             // if left child is null/ empty
                presentNode.left = newNode;
                System.out.println("Inserted new node successful");
                break;
            } else if (presentNode.right == null) {                     // if right child is null/ empty
                presentNode.right = newNode;
                System.out.println("Inserted new node successful");
                break;
            } else {
                queue.add(presentNode.left);    // the loop continues
                queue.add(presentNode.right);
            }
        }


    }

    // delete a  node from a tree
    // I will create 3 methods
    // First method to get the deepest node
    // second method delete the deepest method
    // third method delete any given node in the three.


    //get the deepest node
    public BBinaryNode getDeepestNode() {
        Queue<BBinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BBinaryNode presentNode = null;

        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }

        }
        return presentNode;
    }

    public void deleteDeepestNode() {
        //it uses level-order traversal
        Queue<BBinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BBinaryNode previousNode = null;
        BBinaryNode presentNode = null;

        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();

            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                previousNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }

    }

    // delete a given node

    public void deleteNode(String value) {
        // i will use level order traversal to find the value i want to delete
        // from this tree.

        Queue<BBinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BBinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Givnen node is delete");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }

                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("Given node does not exist");
    }

    //delete entire binary tree
    void deleteBT() {
        root = null;
        System.out.println("The root node ceased to exist");

    }

    //Question => Invert a Binary tree...

    void invert() {
        root = invert(root);
    }

    BBinaryNode invert(BBinaryNode n) {
        if (n == null) { // base condition
            return n;
        }
        BBinaryNode left = invert(n.left);                //recursive calls
        BBinaryNode right = invert(n.right);
        // swap left and right calls
        n.left = right;
        n.right = left;


        return n;

    }

    void printInvertTree() {
        printInvertTree(root);
    }

    // prrint using inorder traversal
    public void printInvertTree(BBinaryNode node) {
        if (node == null) { // base condition
            return;
        }
        printInvertTree(node.left);
        System.out.print(node.value + " ");
        printInvertTree(node.right);

    }


}
