package BinaryTree;

public class MaxDepth {

// find the Maximum Depth or Height of a given Binary tree

//    maxDepth(‘1’) = max(maxDepth(‘2’), maxDepth(‘3’)) + 1 = 2 + 1
//
//    because recursively
//    maxDepth(‘2’) =  max (maxDepth(‘4’), maxDepth(‘5’)) + 1 = 1 + 1 and  (as height of both ‘4’ and ‘5’ are 1)
//    maxDepth(‘3’) = 1

    Node root;

    int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }


}


class Node {
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
