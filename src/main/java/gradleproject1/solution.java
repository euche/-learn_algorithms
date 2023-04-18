/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;
import java.util.*;

/**
 *
 * @author Dell
 */
public class solution {
    
        public static int[] twoSum(int[] nums, int target) {
        
              int length = nums.length;
              
              int[] num1 = {};
              
      
              for(int i = 0; i < length; i++ ){
              
                   if(nums[i] + nums[i + 1] == target){
                   
                       num1[0] = nums[i];
                       num1[1] = nums[i+1];
                   }
              }
              
              return num1;
               
    }
    
    
    
     public static void main(String[] args){
     
         int[] nums ={3,2,4};
         int target = 6;
         
         System.out.println("Answer "+Arrays.toString(twoSum(nums,target)));
     }
}
