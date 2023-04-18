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
public class LLmain {
    
    public static void main(String[] args){
        
//        DoublyLinkedList dll = new DoublyLinkedList();
//        
//        dll.createDoublyLinkedList(1);
//        dll.insertDoublyLinkedList(22, 0);
//        dll.insertDoublyLinkedList(23, 1);
//        dll.insertDoublyLinkedList(24, 2);
//        dll.insertDoublyLinkedList(25, 3);
//        dll.insertDoublyLinkedList(22, 5);
//        dll.traverseDoublyLinkedList();
//        dll.reversalTraversalDoublyLinkedlist();
//        dll.deleteEntireList();
        
        linkedlist y = new linkedlist();
        
        y.createLL(1);
        y.insertLL(6);
        y.insertLL(2);
        y.insertLL(3);
        y.insertLL(4);
        y.insertLL(4);
        y.insertLL(5);
        y.traversalLL();
        
        RemoveDups a = new RemoveDups();
        
        a.removeDups(y);
        y.traversalLL();
        
    
    }
    
}
