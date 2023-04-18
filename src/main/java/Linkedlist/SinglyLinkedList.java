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
public class SinglyLinkedList {
    
    public Node head,tail;
    public int Size;
    
    
    public Node createSinglyLinkedList(int nodeValue){
    
        head = new Node();
        Node node = new Node();
        
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        Size = 1;
        return head;           // return head refrence
                
    
    }
                                          // If Statements and Assignments take O(1)
    
    public void insert(int nodeValue, int Location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(Location == 0){
        
          node.next = head;
          head = node; //insert at beginning of linkedlist
        
        }else if(Location >= Size){  //Insert at the end of List
        
           node.next = null;
           tail.next = node;
           tail = node;
            
        }else{    // Insert node at any given location in the Linkedlist
        
             Node tempNode = head;  // temporary node to hold value
             int index = 0;
             while (index < Location - 1){  //Loop through the Linkedlist   -> This Process will take O(N) complexity because length of location(Size)
                 tempNode = tempNode.next;
                index++;
             }
        
             Node nextNode = tempNode.next;       // nextnode takes the value(reference) of tempnode
             tempNode.next = node;               //
             node.next = nextNode;
                   
        }
        Size++;
    }   // Insertion takes O(n) complexity.
    
    
    //Singly LinkedList Traversal
    public void traverseSinglyLinkedList(){
    
        //first test case to check if the SinglyLinkedList does exist
        
        if(head == null){
        System.out.println("List does not exist");
        }else{
            
          Node tempNode = head;    // starting from head
          for(int i = 0;i < Size;i++){
          System.out.print(tempNode.value);
          
          //adding spacing
          if(i != Size-1){
          System.out.print(" -> ");
          
          }
          
          tempNode = tempNode.next;
          
          }
        
        } 
    
    }
    
    
    // Searching a LinkedList.
    
    
    boolean searchNode(int nodeValue){
        //check head value..
        
        if(head != null){
            // create temp node; takes the head value
            Node tempNode = head;
            //loop through the singlyLinkedList with the help of size of sinlylinkedlist
            
            for(int i = 0;i< Size;i++){
                if(tempNode.value == nodeValue){
                System.out.print("Found the node at Location: "+i+"\n");
                return true;      // means the value exists
                
                }
                // if not continue to the next node 
            tempNode = tempNode.next;
            
            }
        }
        System.out.print("Node not found!");
        return false;
    
    }    ///////////////////////////////////////// Time complexity is O(N)
    
    
    // Deleting a Node from SinglyLinkedList
    
    //  -> Deleting the First Node -> Check if the first node is the only node in the List, if it is, delteing the node is EASY.
    //     -> More than One node, delete the first node, change the head reference
    // -> Deleting any Given Node -> using loop to find the node, before the node you want to delete, then update the node before the deleted node
    // -> Deleting the Last Node
    //     -> when there is only one Node. update Head reference to null
    //      -> when more than one Node  
    
    public void deleteNode(int location){
        
        // Check if the LinkedList exists or not.
        if(head == null){
        System.out.println("The SinglyLinkedList does not exist.");
        return;
        }else if(location == 0){
        // if you have more than one element, in a singlyLinkedlist, you have to set refernece in Head node to second node
       
        head = head.next;
        Size--;
        //if size = 0 after deletion,
        if(Size == 0){
            tail = null;
         }   
        } else if(location >= Size){ // if location reaches the end of singlyLinkedlist, means we want to delete a node from the end of singlyLinkedlist
            // FInd the node located before the last node.
            
            Node tempNode = head;
            
            for(int i = 0; i < Size - 1;i++){
                
            tempNode = tempNode.next;
            }
            if(tempNode == head){  //delete process    Scenario for if Singlylinkedlist contains a single node
              tail = head = null;
              Size--;
              return;
            }
            
            tempNode.next = null;     //Scenario if Singlylinkedlist contains more than one Single node
            tail = tempNode;
            Size--;                 // decrease size of linkedlist and set next node to Null
        

        }else{   //Scenario to find the node that is located before the location of the node given in the paramenter.
            
        Node tempNode = head;
        for (int i = 0; i< location - 1; i++){
        
            tempNode = tempNode.next;
          } 
        
           tempNode.next = tempNode.next.next;     // reassigning reference after deleting a node in the SinglyLinkedlist
           Size--;
        
       
        }
        
        
    } 
    
    public void deleteSinglyLinkedList(){ //delete entire inkedlist
    
         head = null;
         tail = null;
  
         
         // For a Single Node 
    }
    
    
    
    
}
