package BinaryTree;

public class BSTwithMinimumheight {
    // Algorithm problem

//    Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a binary search tree
//    with minimal height.

    // Chat GPT solution

    //public class TreeNode {
    //	public int data;
    //	public TreeNode left;
    //	public TreeNode right;
    //	public TreeNode parent;
    //	public int size = 0;
    //
    //	public TreeNode(int d) {
    //		data = d;
    //		size = 1;
    //	}
    //
    //
    //	public static TreeNode createMinimalBST(int[] array) {
    //      // TODO
    //     return createBinSearchAlgo(array,0,array.length-1);
    //
    //	}
    //
    //	public static TreeNode createBinSearchAlgo(int[] array, int start, int end){
    //
    //
    //      if(start >end){
    //         return null;
    //      }
    //
    //      int middle = (start+end)/2;
    //
    //      TreeNode root = new TreeNode(array[middle]);
    //
    //      root.left = createBinSearchAlgo(array,start,middle-1);
    //      root.right = createBinSearchAlgo(array,middle+1,end);
    //
    //	    return root;
    //	}
    //
    //
    //}


    //Given solution

    //public class TreeNode {
    //	public int data;
    //	public TreeNode left;
    //	public TreeNode right;
    //	public TreeNode parent;
    //	public int size = 0;
    //
    //	public TreeNode(int d) {
    //		data = d;
    //		size = 1;
    //	}
    //
    //  public boolean isBST() {
    //		if (left != null) {
    //			if (data < left.data || !left.isBST()) {
    //				return false;
    //			}
    //		}
    //
    //		if (right != null) {
    //			if (data >= right.data || !right.isBST()) {
    //				return false;
    //			}
    //		}
    //
    //		return true;
    //	}
    //
    //	public int height() {
    //		int leftHeight = left != null ? left.height() : 0;
    //		int rightHeight = right != null ? right.height() : 0;
    //		return 1 + Math.max(leftHeight, rightHeight);
    //	}
    //
    //	private void setLeftChild(TreeNode left) {
    //		this.left = left;
    //		if (left != null) {
    //			left.parent = this;
    //		}
    //	}
    //
    //	private void setRightChild(TreeNode right) {
    //		this.right = right;
    //		if (right != null) {
    //			right.parent = this;
    //		}
    //	}
    //
    //
    //	private static TreeNode createMinimalBST(int arr[], int start, int end){
    //		if (end < start) {
    //			return null;
    //		}
    //		int mid = (start + end) / 2;
    //		TreeNode n = new TreeNode(arr[mid]);
    //		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
    //		n.setRightChild(createMinimalBST(arr, mid + 1, end));
    //		return n;
    //	}
    //
    //	public static TreeNode createMinimalBST(int[] array) {
    //		return createMinimalBST(array, 0, array.length - 1);
    //	}
    //
    //
    //}

}
