package BinaryTree;

public class SumofBinaryTreeValue {

    // Leetcode Medium

    // Given the root of a binary tree, return the sum of values of its deepest leaves.

    //Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
    //Output: 15
    //Example 2:
    //
    //Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
    //Output: 19

    //Solution we use BFS(Breadth First Search Algorithm) and Recursion


    public int maxLevel = 0;
    public int sum = 0;

    public int deepestLeavesSum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        addBFS(root, 0);
        return sum;


    }

    private void addBFS(TreeNode root, int level) {

        if (root == null)
            return;


        if (level > maxLevel) {
            sum = 0;
            maxLevel = level;
        }

        if (level == maxLevel) {
            sum = sum + root.val;
        }
        addBFS(root.left, level + 1);
        addBFS(root.right, level + 1);

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}


