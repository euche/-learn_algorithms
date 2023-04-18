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
public class CircularDoubyLinkedist {
    
      public dNode head;
    public dNode tail;
    public int size;
    
    
    public dNode createCDLL(int nodeValue){
        
        head = new dNode();
        dNode newNode = new dNode();
        // assign nodeValue to newNode
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    
    }
    
    public void insertNodeinCDoublyLinkedList(int nodeValue,int location){ 
       
        dNode newNode = new dNode();
        newNode.value = nodeValue;
        
        if(head == null){
            createCDLL(nodeValue);
            return;
        }else if(location == 0){  // First case-> Insert at the begining of circulardoubltlinkedlist
            newNode.next = head;   // head is current first Node
            newNode.prev = tail; // tail is last node
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
       
        }else if(location>=size){//Second case-> Insert at the end of Linkedlnlist
          newNode.next = head;
          newNode.prev =tail;
          head.prev = newNode;
          tail.next = newNode;
          tail = newNode;
            
        }else{// Insert at a specified location in the linkedlist
            dNode tempNode = head;
            int index = 0;
            while(index < location - 1){ //travesing the list
            tempNode = tempNode.next;
            index++;
            
            }
            //when location is reached.
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
             newNode.next.prev = newNode;

        }
        size++;
        
        
        
    }
    
    
    
    
    public void traverseCircularDoublyLinkedList(){
    
        // Same as DOublyLinkedLIst
    }
    void reverseTraversalDoublyLinkedList(){
    
      // Same as DOublyLinkedLIst 
    }
    
    
    public boolean searchDoublyLinkedList(int nodeValue){
    
   // Same as DOublyLinkedLIst
   return true;
    
    }
    
    
    public void deleteNode(int location){
    
    if(head == null){
    
        System.out.println("The Circular DoublyLinkedList doesnt exist");
            return; 
    }else if(location == 0){// first element case.
        
        if(size == 1){// case 1, if it contains a single node;
            head.prev = null;
            head.next = null;
            head = tail = null;
            size--;
             return;
            
        }else{ //case 2, it contains more than one node
        
            //2nd node becomes first
            head = head.next;
            head.prev = tail;
            tail.next = head;
            
            //decrease size by 1
           size--;   
        }
        
    }else if(location >= size){
    
    if(size == 1){// case 1, if it contains a single node;
            head.prev = null;
            head.next = null;
            head = tail = null;
            size--;
             return;
            
        }else{
          //case-> more than one node
          
          tail = tail.prev;
          tail.next = head;
          head.prev = tail;
          size--;    
      
        }
    
    }else{
       //Case -> any given location in circular linked list
       
       dNode tempNode = head;
       for(int i = 0; i < location - 1; i++){
         tempNode = tempNode.next;
       }
      tempNode.next = tempNode.next.next;
       tempNode.next.prev = tempNode;                // same as doubltlinkedlist.
      size--;
    }
    
    
    }
    
    
    public void deleteCLL(){
    
 
   dNode tempNode = head;
   
   for(int i = 0;i < size;i++){ 
    
        tempNode.prev = null;
        tempNode = tempNode.next; // for traversal
   }
      // standard procedure
      head = null;
      tail = null;
      
     System.out.println("The circular Doublylinkedlist has been deleted");
   
   
   
    
    }
    
    
    
    
}
