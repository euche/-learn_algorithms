/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AVLtree;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dell
 */
public class AVLtree1 {
    BinaryNode root;
    
    // create an Instance of AVL Tree and set root node to null
  
    //constructor
  public  AVLtree1(){
        root = null;
}
  
  //Preorder Traversal
  public void preOrder(BinaryNode node){                     // root node, left subtree, right subtree
  
      if(node == null){
         return;
      }
      
      System.out.println(node.value+" ");
      preOrder(node.left);
      preOrder(node.right);
 
  }
  
  
  public void inOrder(BinaryNode node){                    //left subtree, root node right subtree
      
      if(node == null){
         return;
      }
      
      inOrder(node.left);
      System.out.println(node.value+" ");
      inOrder(node.right);    
  
  }
  
  
  public void postOrder(BinaryNode node){
  
      if(node == null){
          return;
      }
      
      postOrder(node.left);
      postOrder(node.right);
      System.out.println(node.value+" ");
      
  }
  
  
  public void levelOrder(){
  
  Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
  queue.add(root);                                                       // add root
                                                             
  while(!queue.isEmpty()){                                                 // while queue is not empty  traverse by Level
  
  BinaryNode presentNode = queue.remove();                               // instance of present node
  System.out.println(presentNode.value + " ");
  
     if(presentNode.left!= null){
          queue.add(presentNode.left);
     }
     
     if(presentNode.right!=null){
         queue.add(presentNode.right);  
     }
  }                                                          
 
  
  }
  
  
  //Binary Search Method
  
 public BinaryNode search(BinaryNode node, int value){
  
       if(node ==  null){
       System.out.println("Value: "+value+"not found  in AVL.");
       return null;
       }else if(node.value == value){
       System.out.println("Value: "+value+"found in AVL.");
       return node;
       }else if(value < node.value){
       return search(node.left,value);
       }else{
       return search(node.right,value);
       }
  
  }
  
  
  
    
    
    
}
