/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberarray;

/**
 *
 * @author Dell
 */
public class Productofarray {
    
    public static int[] productExceptSelf(int[] nums) {
    
      int [] result = new int[nums.length];
      int[] t1 = new int[nums.length];
      int[] t2 = new int[nums.length];
      
      
      t1[0] = 1;
      t2[nums.length-1] = 1;
      
      //scan from left to right
      for(int i = 0; i<nums.length-1;i++){              // not my solution....BUT Optimal Solution;
          t1[i+1] = nums[i] * t1[i];
      }
        //scan from right to left
        for(int i = nums.length-1; i>0;i--){
        t2[i-1] = t2[i] * nums[i];
        }
        
        //multiply
        for(int i = 0; i<nums.length;i++){
            result[i] = t1[i] * t2[i];
        }
        
        
      return result;  
    }
    
    public static void main(String[] args){
    
        int[] arggs = {1,2,3,4};
    
        
        System.out.println(productExceptSelf(arggs));
    
    }
    
}
