/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;

/**
 *
 * @author Dell
 */
public class Besttimetobuystockexample {
    
    public int maxProfit(int[] prices ){
    
        int smalest = prices[0];
        int smallest_index = 0;
        
        HashMap<Integer,Integer> j = new HashMap<Integer,Integer>();  
        
        for(int i = 0; i < prices.length;i++){
        
            j.put(prices[i], i);
            
            if(prices[i] < smalest){
                
                smalest = prices[i];
                smallest_index = i;
                
            }
        }
        
        if(smallest_index == prices.length-1){
       
          return 0;
        }else{
        
        
        }
        
        
        
        
   
        
         return 0;   
    }
    
    
    
    public static int maxProfit(int[] prices, int t ){
    
     if(prices == null || prices.length <= 1){
     return 0;
     }
     
     int min = prices[0];
     int result = 0;
     
     for(int i = 1;i < prices.length;i++){                       //dynamic programming :: Using 2 Recursive funtions
        result = Math.max(result, prices[i]-min);                  // 2 Recursive Functions
        min = Math.min(min,prices[i]);  
     }
     
     return result;
    }
    
    
    
    
    
    
    public static int maxProfit(int[]prices, int t,int y){                 // my crazy solution
    
    if(prices == null || prices.length <= 1){
     return 0;
     }
    
    int smalest = prices[0];
        int smallest_index = 0;
        
        int profit;
        
        
        
        HashMap<Integer,Integer> j = new HashMap<Integer,Integer>();  
        
        for(int i = 0; i < prices.length;i++){
        
        //    j.put(prices[i], i);
            
            if(prices[i] < smalest){   
                smalest = prices[i];
                smallest_index = i;   
            }
        }
        
        
        if(smallest_index == prices.length-1){
          return 0;  
        }
        
        
        for(int k = prices.length-1; k>=0 ;k--){
        
            
          profit = prices[k]-smalest;
          
          smalest =Math.min(profit, smalest);
          
          j.put(profit,smalest);
        
        
        }
        
        
//        map.entrySet().removeIf(entry -> keySet.contains(entry.getKey()) );
//        if(j.containsKey(0)){
//       
//        
//        }
        
          // if(j.containsValue(0)){}


         j.entrySet().removeIf(entry -> j.values().contains(0));
         
        // find the largest key in this hashmap and that is the answer                  MY OWN SOLUTION
    
    
    
    
    return 0;
    }
    
    
    
    
   public static void main(String[] args){
       
            int[] nums = {7,1,5,3,6,4};
             int t = 12;
     
     System.out.println("Answer "+maxProfit(nums,t));
       
   }
    
}
