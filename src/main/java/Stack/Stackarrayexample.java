/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.*;
/**
 *
 * @author Dell
 */
public class Stackarrayexample {
    
    // Code for Method or Function here
    
    public static int rturnInt(int[] nums, int target){
    
    Stack<Integer> s = new Stack<>();                         
    int ans = 0;
    
    for(int i = 0; i<nums.length;i++){                         // adds the elements of the array using LIFO(Last - In -First - Out) -> Reverse Order 
           s.addElement(nums[i]);    
    }
    
    while(!s.empty()){
    ans = s.search(target);
    
    return ans;
    }
    
    return ans;
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args){
    
     int[] nums = {3,3,2,4,12,3,3};
     int t = 12;
     
     System.out.println("Answer "+rturnInt(nums,t));
        
        
        
    }
    
}
