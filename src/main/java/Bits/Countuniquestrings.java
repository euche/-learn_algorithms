/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bits;



import java.util.*;

/**
 *
 * @author Dell
 */
public class Countuniquestrings {
    
    public static int cntDistinct(String str){
    
        HashSet<Character> a = new HashSet<>();   // prevent Repetitions
        
        for(int y = 0;y<str.length();y++){
        
          a.add(str.charAt(y));

        }
        
    return a.size();
    }
    
    public static boolean checkUniqueStrings(String str){   //check for unique strings using bitwise operations
    
          // An integer to store presence/absence
        // of 26 characters using its 32 bits.
        int checker = 0;
     
        for (int i = 0; i < str.length(); ++i)
        {
            int val = (str.charAt(i)-'a');
     
            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return false;
     
            // set bit in checker
            checker |= (1 << val);
        }
     
        return true;
    
    }
    
//1
//
//"<<" means left shift the bits of a value.
//">>" means right shift the bits of a value.
//
//example:
//int a = 5; //the binary value of 5 is 101
//a = a << 3; //left shift 3 bits on 101, 101 000<< add 3 bits(0) on the right, become '101000'
//System.out.println(a); //this will display 40, the decimal for '101000'
//
//int b = 9; //the binary value of 9 is 1001
//b = b >> 3; //right shift 3 bits on >>000 1001 add 3 bits(0) on the left, truncate the last 3 bits on the right become '001'
//System.out.println(b); //this will display 1, the decimal for '001'   
    
    
    //Bitwise OR Operations
    
//    let a = 5;      // 00000000000000000000000000000101
//a |= 3;         // 00000000000000000000000000000011
//
//console.log(a); // 00000000000000000000000000000111
//// expected output: 7
    
    
   
//    ----------------------------------------------------------------------------------------
//Operator   Description                                   Example
//----------------------------------------------------------------------------------------
//|=        bitwise inclusive OR and assignment operator   C |= 2 is same as C = C | 2
//^=        bitwise exclusive OR and assignment operator   C ^= 2 is same as C = C ^ 2
//&=        Bitwise AND assignment operator                C &= 2 is same as C = C & 2
//<<=       Left shift AND assignment operator             C <<= 2 is same as C = C << 2
//>>=       Right shift AND assignment operator            C >>= 2 is same as C = C >> 2  
//----------------------------------------------------------------------------------------
//    
    
    
    
    // More on bitwise operators https://www.geeksforgeeks.org/bitwise-operators-in-java/
    
    
    

    
    public static void main(String[] args){
    
    String str = "geeksforgeeks";
    System.out.print(cntDistinct(str));
    }
    
}
