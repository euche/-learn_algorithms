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
public class maximumsubarray {
    
    
    public static int maxSubArray(int[] nums){                     //We wil try to use KADANE's ALGORITHM to solve this.
    
        //create => GLOBAL MAXIMUM AND INTIALIZE WITH MOST NEGATIVE SUM
        
        int global_max_sum = Integer.MIN_VALUE;
        int current_no_sum = 0;                               //=> VARIABLE TO STORE CURRENT SUM = 0
        
        for(int y= 0; y< nums.length;y++){            //RUN LOOP
        
          if(current_no_sum < 0){           //=> if current SUm < 0, update with 0;
             current_no_sum = 0;
             
          }
          current_no_sum+=nums[y];           //add current element to current sum  and update global maximum if current sum is greater than global maximum 
           global_max_sum = Math.max(global_max_sum,current_no_sum);
             
          
        }
        
          
    return global_max_sum;
    }
    
    
    
    
    
    public static void main(String[] args){
    
      int[] nums = {5,4,-1,7,8};
      
      System.out.println(" Answer => "+maxSubArray(nums));
        
    }
    
}
