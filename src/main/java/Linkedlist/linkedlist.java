/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

/**
 *
 * @author Dell
 */
public class linkedlist {
    
     public dNode head;
    public dNode tail;
    public int size;
    
    public void createLL(int nodeValue){
    
        dNode newNode = new dNode();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }
    
    public void insertLL(int nodeValue){
    // add new value to the end of the current node
    
    dNode newNode = new dNode();
    newNode.value = nodeValue;
    newNode.next = null;    //not circularsinglylist
    tail.next = newNode;
    tail = newNode;
    size++;
    
    }
    
    
    public void traversalLL(){
    dNode tempNode =head;
    
    for(int i =0;i<size;i++){
   
    System.out.print(tempNode.value);
    
    if(i!=size-1){
    System.out.print("->");
    }
    tempNode = tempNode.next;
    
    }
    System.out.println("\n");
    }
    
    
    
    
    
    
    
    
}
