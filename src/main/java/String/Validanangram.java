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
public class Validanangram {
    
    public static boolean isAnagram(String t, String h){
     
        boolean valid = false;
        
    // convert String to Character Array
     char[] st = new char[t.length()];               //character array for the First String
     char[] sh = new char[h.length()];                   //cahracter for the Second String
     
                                                                 // doesnt work on NETBEANS but works in leetcode! hooray   
             
         if(t.length()!= h.length())
             return false;
                                                                 
                                                                 
     for(int i = 0; i <t.length();i++){
                                                                  // My solution passed only One TEST CASE. My Solution is now correct.
      st[i] = t.charAt(i);
      
     }
     
     for(int j = 0; j < h.length();j++){
     sh[j] = h.charAt(j);   
     }
     
     Arrays.sort(st);
     Arrays.sort(sh);
     
     String stt = toString(st);
     String shh = toString(sh);
     
     if(stt.matches(shh)){
         return true;
     }else{
     
     return false;
     }
     
     
//    return Arrays.equals(st,sh);
     
     
    }
    
     public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);
 
        return string;
    }
    
    
    
    
    
    
    public static boolean isAnagram(String h, String i, int y){
        
        int len = h.length();                                   //This SOLUTION IS NOT VALIDATED YET>
        int[] fMap = new int[123];
        
        if(i.length()!= len)
            return false;
        
        
        for(int j = 0; j<len; j++ ){
        
             fMap[h.codePointAt(j)]++;
            // System.out.println("Track" + fMap[h.codePointAt(j)]++);
        }
        
        for(int j = 0; j<len; j++){
        
             if(--fMap[i.codePointAt(j)]<0)
                 return false;
              //System.out.println("Track" +--fMap[i.codePointAt(j)]);
             
       }
           
        
     return true;
    }
    
    
    
    
    public static void main(String[] args){
    
         String s1 = "anagram", s2 = "nagaram",s3 = "rat",s4 = "car";
        
        isAnagram(s3,s4);
        System.out.println(isAnagram(s3,s4));
        
//        isAnagram(s3,s4,0);
        
        
    }
    
}
