/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linkedlist;

import java.util.HashSet;

/**
 *
 * @author Dell
 */
public class RemoveDups {
   
    
    // -> Use a Set, it automatically tracks duplicates SPECIFICALLY HASHSET 
    
    void removeDups(linkedlist e){
    
         HashSet<Integer> s = new HashSet<Integer>();
         dNode current = e.head;
         dNode prev = null;
         
         while(current != null){  //loop through linkedlist till the end 
          int curVal = current.value;
          if(s.contains(curVal)){
          
              // delete curent value.
              //reasssign prev.nex to current.next
              prev.next = current.next;
              e.size--;
              
          }else{
             s.add(curVal);
             prev = current;
          
          }
          
         current = current.next;
         }
         
         
         
         
        
    }
    
    
    
    
    
}
