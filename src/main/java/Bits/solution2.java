/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bits;

/**
 *
 * @author Dell
 */
public class solution2 {
    
        public static int solve(int a,int b){
        
            //Interview quesiotn codility NMI   Binary and bits
            
            int sol1 = a * b;
            int count = 0;
            
            while(sol1 > 0){
               count += sol1& 1;
                 sol1 >>= 1;
            
            }
           
            return count;
            
        }
        
        
         public static void main(String[] args){
         
         
         System.out.println("Answera+ "+solve(3,7));
         
         }
    
    
}
