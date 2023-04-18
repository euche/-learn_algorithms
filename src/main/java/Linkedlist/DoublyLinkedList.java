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
public class DoublyLinkedList {
    
    dNode head;
    dNode tail;
    int size;
    
    
    public dNode createDoublyLinkedList(int nodeValue){
      head = new dNode();
      dNode newNode = new dNode();
      
      newNode.value = nodeValue;
      newNode.next = null;
      newNode.prev = null;
      head = tail = newNode;
      size = 1;
      
      return head;
    }
    
    
    public void insertDoublyLinkedList(int nodeValue,int location){
        
        dNode newNode = new dNode();  
        newNode.value = nodeValue;
        
        if(head == null){
        System.out.println("Doubly linked list does not exist");
        
        createDoublyLinkedList(nodeValue); // create new doublylinkedlist
        return;
        
        }else if(location == 0){
        newNode.next = head;
        newNode.prev = null;
        head.prev = newNode;
        head = newNode;
        
        }else if(location >= size){  // inserting at the end of the list
        
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
           tail = newNode;
        }else{  //insert at any location
          dNode tempNode = head;
          int index = 0;
          
          while(index < location - 1){
             tempNode = tempNode.next; //loop through    
             index++; 
          }                                            /////// the logic reaches location-1, where the new node to be inserted
                                                              // current node is tempNode
          newNode.prev = tempNode;
                                                     // update newNode next with to node after current node(tempNode)
          newNode.next = tempNode.next;
                                                     //update currenr node next reference to new node
          tempNode.next = newNode;
                                                       // form backwards link for newnode
          newNode.next.prev = newNode;
     
        }
        size++;
        
        
    }
    
    
    public void traverseDoublyLinkedList(){ ///Takes O(n) 
    
        if(head != null){
          dNode tempNode = new dNode();
          tempNode = head;
          
          for(int i =0;i<size;i++){
          System.out.print(tempNode.value);
          
          //adding spacing
          if(i != size-1){
          System.out.print(" -> ");
          
          }
          tempNode = tempNode.next;
          
          }
          
            
        }else{
         System.out.println("List does not exist");
        }
          System.out.println("/n");
        
    }
    
    
    public void reversalTraversalDoublyLinkedlist(){///Takes O(n)
        
        
        if(head != null){
        dNode tempNode = tail;
         
         for(int i =0;i < size; i++){
          System.out.print(tempNode.value);
          if(i != size-1){
          System.out.print("<-");
          }
          tempNode = tempNode.prev;
         
         }

        }else{
               System.out.println("DoublyLinkedList does not exist");
    
            }
        
    
    System.out.println("/n");
    }
    
    
   
    public boolean searchDoublyLinkedList(int nodeValue){   //search location
    
        if(head != null){
        
         dNode tempNode = head;
         for(int i = 0; i < size; i++){
          
             if(tempNode.value == nodeValue){
             
               System.out.print("Node Found at Index->"+i);
                  return true;
             }
           tempNode = tempNode.next;
         
         } 
        
        }
        
     System.out.print("Node not found");   //default message  return false
      return false;
    
    }
    
   public void deleteNode(int location){
   
       if(head == null){
            System.out.println("The DoublyLinkedList doesnt exist");
            return;   
          }else if(location == 0){
             if(size == 1){
               head = null;
               tail = null;
               size--;
               return;
             }else{    //first node-> more than one node
               head = head.next;
               head.prev = null;
               size--;
             
             }
          
          }else if(location>= size){// delete the last node
              // creating a temporary node
              dNode tempNode = tail.prev;
              
              if(size == 1){ // if the list contains one element.
               head = null;
               tail = null;
               size--;
               return;
             }else{
              tempNode.next = null;  // last node points to null/ tempnode is our assumed last node
              tail = tempNode;
              size--;
              
              }
          
          }else{  // delete the element at any given Location in doubly linked list;
              dNode tempNode = head;
              for(int i = 0; i < location - 1; i++){
                  tempNode = tempNode.next;
              }
              tempNode.next = tempNode.next.next;   // creates a link between the node and the next node after the intended deleted node;
              // creating a back link;
              tempNode.next.prev = tempNode;
              size--;
              
          }
   
   } 
    //NOTE: tempNode is for traversal operations
    
   public void deleteEntireList(){
   dNode tempNode = head;
   
   for(int i = 0;i < size;i++){ 
    
        tempNode.prev = null;
        tempNode = tempNode.next; // for traversal
   }
      // standard procedure
      head = null;
      tail = null;
      
     System.out.println("The Doublylinkedlist has been deleted");
   
   
   }
   
   
    
    
}
