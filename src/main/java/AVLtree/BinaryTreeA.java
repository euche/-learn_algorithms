package AVLtree;

public class BinaryTreeA {
    // Binary Tree using Arrays

    //Array type is String

    String[] arr;
    int lastUsedIndex;

    public BinaryTreeA(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Tree of size" + size + "has been created");
    }

    // isFull method

    boolean isFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    // The isFull method is to check whether we can properly
    // insert a node into the tree

    void insertMethod(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("Value " + value + "is inserted");
        } else {
            System.out.println("The Binary tree is full");
        }
    }

    //Pre-order traversal
    // Method takes index of the root node parameter at first.
    public void preOrder(int Index) {
        if (Index > lastUsedIndex) {
            return;
        }

        System.out.println(arr[Index] + " ");
        preOrder(Index * 2);  // for left child
        preOrder(Index * 2 + 1); // for right child

    }

    //inOrder traversal
    public void inOrder(int index) {
        // left subtree -> root node -> right subtree
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2); // left child
        System.out.println(arr[index] + " "); //root node
        inOrder(index * 2 + 1); // right child

    }

    //post order traversal()
    public void postOrder(int index) {
        // left subtree -> right subtree -> rootnode
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2); // left child
        postOrder(index * 2 + 1); // right child
        System.out.println(arr[index] + " "); //root node

    }

    // level order Traversal
    public void levelOrder() {
        // level order traversal by looping through the initialized array
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    // Search Method
    public int search(String value) {          // returns the index being searched for.
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.println(value + "has been found at Index " + i);
                return i;
            }
        }
        System.out.println("Value does not exist in this Binary Tree ");
        return -1;
    }

    // Delete Method
    public void delete(String value) {
        int location = search(value);  // use search method to find the location
        if (location == -1) { // check if node is present
            return;
        } else {
            arr[location] = arr[lastUsedIndex]; // replace the deepest node with found location
            lastUsedIndex--;   // reduces the last used index by -1 and garbage collector does the rest(deletes the former deepest node).
            System.out.println("Node deleted");
        }


    }

    // Delete entire binary tree method.
    public void deleteBinaryTreeA() {

        try {
            arr = null;
            System.out.println("Binary Tree has been deleted");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}


