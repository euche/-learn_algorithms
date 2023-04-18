package AVLtree;

import java.io.*;

import java.util.ArrayList;

public class TreeNode {

    // Class for Creating a Basic Tree

    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();  //initialise children in the constructor
    }

    // create a link between a treenode and its children

    //method for adding children to a treenode
    public void addChild(TreeNode n) {
        this.children.add(n);
    }


//    public String print(int level) {
//        String ret;
//        ret = " ".repeat(level) + data + "\n";
//        for (TreeNode j : this.children) {
//            ret += j.print(level + 1);
//        }
//        return ret;
//    }


}
