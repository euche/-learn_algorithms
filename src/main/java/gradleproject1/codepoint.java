/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

/**
 *
 * @author Dell
 */
public class codepoint {
    
    public static void main(String[] args){
    
        String str = "abCDE";
      System.out.println("String = " + str);                                    //checkout explaination of codepoint
      
      // codepoint at index 1
      int retval = str.codePointAt(1);
      // prints character at index1 in string
      System.out.println("Character(unicode point) = " + retval);
    
    }
    
    
}
