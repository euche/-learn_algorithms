/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DC;

/**
 *
 * @author Dell
 */
public class ConvertString {
    // Convert String to Another Problem.
    // Problem statement
    // S1 and S2 are given Strings
    // Convert S2 to S1 using delete, insert or replace operations
    // Find the minimum Count of Edit operations
    
    private int findMinOperations(String s1, String s2, int index1,int index2){
       if(index1 == s1.length()){
          return s2.length()-index2;
       }
           
       if(index2 == s2.length()){
           return s1.length()- index1;
       }
    
       if(s1.charAt(index1)==s2.charAt(index2)){
          return findMinOperations(s1,s2,index1+1,index2+1);
       }else{
           int deleteOp = 1+ findMinOperations(s1,s2,index1+1,index2);
           int insertOp = 1+ findMinOperations(s1,s2,index1,index2+1);
           int replaceOp = 1+findMinOperations(s1,s2,index1+1,index2+1);
           return Math.min(deleteOp,Math.min(insertOp,replaceOp)); // Accepts only two parameters
       }
    
    
    }
    
    public int findMinOperations(String s1,String s2){
    
     return findMinOperations(s1,s2,0,0); 
    }
          
    
    
    
    
   
}
