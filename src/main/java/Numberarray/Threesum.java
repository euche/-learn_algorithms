/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numberarray;


import java.util.*;

/**
 *
 * @author Dell
 */
public class Threesum {
    
    public static  List<List<Integer>> threeSum(int[] nums) {    // My Own Solution......
    
        
       List<List<Integer>> ans = new ArrayList<>(); 
        
        Arrays.sort(nums);  //
        
    int y = nums.length;
    int k = 3;      // triplets condition
    int target = 0;
    
    if(y ==1){
    
    return  null;
    }else if(y == 0){
    
    return null;
    
    }
    
    
   HashMap<Integer,Integer> hashtable = new HashMap<Integer,Integer>();
    
//   for(int i:nums){
//   
//   hashtable.put();
//   }
   
    
   for(int i = 0;i <nums.length-2;i++){
   
       hashtable.put(nums[i], i);
       
      for(int j = i+1;j<nums.length-1;j++){
      
          for(int l = j+1; l < nums.length;l++){
          
         
              
        if(target ==  nums[i]+nums[j]+nums[l]){
             
              
                   Integer abc[] = {nums[i],nums[j],nums[k]};  
                  ans.add(Arrays.asList(abc));
              
              
              
          }
              
              
          }
      }
       
   } 
    
   
   
    return ans; 
    
        
    }
    
    
    public static  List<List<Integer>> threeeSum(int[] nums) {
    
    List<List<Integer>> array = new ArrayList<List<Integer>>();           //OPTIMAL SOLUTION FOUND ON LEETCODE
    
    Set<List<Integer>> threeSumSet = new HashSet<>();   // Hashset prevents duplication
    
    
    for(int i = 0; i < nums.length-2;i++){
      for(int j = i+1; j < nums.length-1;j++){
         for(int c = j + 1; c< nums.length; c++){
         
             if(nums[i]+nums[j]+nums[c] == 0){                 
             
                 List<Integer> subArray = new ArrayList<>();
                 
                 subArray.add(nums[i]);
                 subArray.add(nums[j]);
                 subArray.add(nums[c]);
                 
                 Collections.sort(subArray);
                 threeSumSet.add(subArray);
                 
             
             }
             
         }   
      }
    }
    
     array.addAll(threeSumSet);
     return array;
    
    }
     
    
    public static void main(String[] args){
    
    int[] nums = {-1,0,1,2,-1,-4};
    
    System.out.println(threeSum(nums));
    
    //System.out.println(threeeSum(nums));
    
    
    }
    
}
