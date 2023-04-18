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
public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
     public Node createCircularSinglyLinkedList(int nodeValue){
    
         head = new Node();
         Node node = new Node();
         node.value = nodeValue;
         node.next = node;
         
         head = node;
         tail = node;
         
         size = 1;
         
         return head;
               
    }
     
     // three scenarios
     public void insertCircularSinglyLinkedList(int nodeValue, int location){
     
         Node node = new Node();
         node.value = nodeValue;
         
         if(head == null){
           createCircularSinglyLinkedList(nodeValue);
           return;
         }else if(location == 0){    
         node.next = head;
         head = node;
         tail.next = head;
         
         } else if(location >= size){
         
         tail.next = head;
         tail = node;
         tail.next = head;
             
         }else{
         // inserting in a specified location, loop through unitl the specified location in the method is reached.
         
         Node tempNode = head;
         int index = 0;
         //loop through until specified location is reached...traverse through the circular singlylist
         while(index < location -1){
         tempNode = tempNode.next;
         index++;
       // after reaching index == rotation,       
         }
         //newly created node's reference to point to the next node. ---tempNode's next Reference.
         node.next = tempNode.next;    
         tempNode.next = node;           // inserting a  new node between current node and next node 

//        then increase size by 1 because we are insering a new node into the circularsinglylist.         
         }
         size++;
 
     }
    
     
     
     // Traverse a circular singly Linked list
     // ----> It is the same as Traversal in SinglyLinkedList
      public void traverseCircularSinglyLinkedList(){
    
        //first test case to check if the SinglyLinkedList does exist
        
        if(head == null){
        System.out.println("CircularSinglyLinkedList does not exist");
        }else{
            
          Node tempNode = head;    // starting from head
          for(int i = 0;i < size;i++){
          System.out.print(tempNode.value);
          
          //adding spacing
          if(i != size-1){
          System.out.print(" -> ");
          
          }
          tempNode = tempNode.next;   
          }
        
        } 
    
    }
      
      
      public boolean searchNode(int nodeValue){
      
      if(head != null){
      
           Node tempNode = head; 
           for(int i = 0; i < size; i++){
               
               if(tempNode.value == nodeValue){
                   System.out.print("Node Found at Index->"+i);
                  return true;
               }
               tempNode = tempNode.next; // Searching to continue to the next node.
           
           }  
      }
      
      System.out.print("Node not found");
      return false;
      
      }
      
      
      public void deleteNode(int Location){
          
          if(head == null){
            System.out.println("The CSL doesnt exist");
            return;   
          }else if(Location == 0){
           head = head.next; //sets head to second node
           tail.next = head; // tail points to second node
           size--;  //decrease size after removing a 
         
           //check if linkedlist has one element
           if(size == 0){
           tail = null;
           head.next = null;
           head = null;
           }
           
          }else if(Location >= size){
          
           Node tempNode = head;
           for(int i =0; i < size-1;i++){
           tempNode = tempNode.next;
           }
          //check if there is a single node in the linkedlist
          if(tempNode == head){
             head.next = null;
             tail = null;
             head = null;
             return;
          }
          // if you have more than on element in our circularsinglylist,
          tempNode.next = head;
          tail = tempNode;
          size--;
          
          } else{
              // delete a node from any given location
              Node tempNode = head;
              for(int i =0; i < Location-1; i++){
                  tempNode = tempNode.next;
              }
              tempNode.next = tempNode.next.next;   // setting current node next reference to the node located after the deleted node
              size--;
          
          }     
      
      }
      
      
      public void deleteCSL(){
      
       if(head == null){
       System.out.println("CircularSinglyLinkedList does not exist");
       } else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("CircularSinglyLinkedList has been deleted");
        }
      }
      
     
     
     
    
    
    
    
    
}
