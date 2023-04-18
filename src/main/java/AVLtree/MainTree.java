package AVLtree;

public class MainTree {
    public static void main(String[] args) {
//      TreeNode drinks = new TreeNode("Drinks");
//        TreeNode hot = new TreeNode("");
//        TreeNode cold = new TreeNode("Drinks");
//        drinks.addChild(hot);
//        drinks.addChild(cold);

        //testing preorder traversal in BinaryTree

        BinaryTreeLL tt = new BinaryTreeLL();
        BBinaryNode N1 = new BBinaryNode();
        N1.value = "N1";
        BBinaryNode N2 = new BBinaryNode();
        N2.value = "N2";
        N1.left = N2;   // the creation goes on....

        // testing insertion method
        BinaryTreeLL tnew = new BinaryTreeLL();
        tnew.insertNode("N1");
        tnew.insertNode("N2");
        tnew.insertNode("N3");
        tnew.insertNode("N4");
        tnew.insertNode("N5");
        tnew.insertNode("N6");
        tnew.insertNode("N7");
       // tnew.levelOrder();

        System.out.println();
       // tnew.deleteNode("N2");
     //   System.out.println();
     //   tnew.levelOrder();
     //   tnew.deleteBT();
        tnew.invert();
        tnew.printInvertTree();
       System.out.println();

//        BinaryTreeA ta = new BinaryTreeA(9);
//        ta.insertMethod("N1");
//        ta.insertMethod("N2");
//        ta.insertMethod("N3");
//        ta.insertMethod("N4");
//        ta.insertMethod("N5");
//        ta.insertMethod("N6");
//        ta.insertMethod("N7");
//        ta.insertMethod("N8");
//        ta.insertMethod("N9");
//        System.out.println();
//       // ta.preOrder(1);
//        ta.postOrder(1);

      // We are goingto check Trie examples  here as well
        Trie nT = new Trie();
        nT.insertMethod("API");
        nT.insertMethod("APIS");
        nT.searchTrie("APIS");
        nT.delete("API");
        nT.searchTrie("API");



    }

}
