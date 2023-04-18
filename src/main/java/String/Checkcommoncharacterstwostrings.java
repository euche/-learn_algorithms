/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;



import java.util.*;
/**
 *
 * @author Dell
 */
public class Checkcommoncharacterstwostrings {
    
    //Given Two Strings, Check if there are common Characters in Two Strings
   public static boolean checkCommonCharacters(String s1, String s2){
                                                                              //geeksforgeeks Solution
        HashMap<Character, Integer> mp = new HashMap<>();          
        
       for( int i = 0; i < s1.length();i++){
       
           mp.put(s1.charAt(i),mp.get(s1.charAt(i))== null ? 1: mp.get(s1.charAt(i))+ 1);  //if putting cahracter and integer == null, return 1 else get value of char in s1 and increase by 1  
       
       }
        
    for(int i = 0; i < s2.length();i++){
    
        
        if(mp.get(s2.charAt(i))>0){  //get value of the character and compare if it is greater than 0
            return true;
        }
    
    }
    
    return false;
    }
    
    
    
    
    public static void main(String[] args){
        
         String st1 = "geeksforgeeks", s2 = "abc";
         boolean ans = checkCommonCharacters(st1,s2);
         
         if(ans == true){
         
           System.out.println("yes");             
         }else{
             System.out.println("no"); 
         
         }
    
    
    }
    
}
