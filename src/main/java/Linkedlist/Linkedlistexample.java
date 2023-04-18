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
public class Linkedlistexample {
    
     public static void main(String[] args){
     
        SinglyLinkedList Sll = new SinglyLinkedList();
        Sll.createSinglyLinkedList(5);
        //System.out.println(Sll.head.value);
        Sll.insert(9, 0);
        Sll.insert(50, 1);
        Sll.insert(80, 3);
        Sll.insert(81, 4);
        
       // System.out.println(Sll.head.value);
       
        Sll.traverseSinglyLinkedList();
        
        //testing circluarsinglylist
        
       CircularSinglyLinkedList cll = new CircularSinglyLinkedList(); 
       cll.createCircularSinglyLinkedList(5);
       
       cll.insertCircularSinglyLinkedList(4, 0);
       cll.traverseCircularSinglyLinkedList();
       
       
       DoublyLinkedList a = new DoublyLinkedList();
       a.createDoublyLinkedList(10);
       
       // print out value in Doubly linkedlist....
       System.out.print(a.head.value);
       
        
        
        
        
        
       
     }
     
  
}
