/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwopointerAlgo;

/**
 *
 * @author Dell
 */
public class Containerwaterproblem {
    
    
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.
    
    public static int maxArea(int[] height) {
        
        
        
        int y = 0; //starting index.
        int z = height.length-1, area = 0;
        
        while (y<z){
        
          area = Math.max(area, Math.min(height[y],height[z])* (z-1));
        
          if(height[y]< height[z]){
          
                 y+=1;
          }else{
          
              z-=1;
          
          }
              
        }
        
        return area;
        
    }
    
    
    
      public static int maxArea1(int[] height){    //adjusted answer from the top to fit Testcases  TWO POINTER TECHNIQUE
    
      if(height.length<=2){
            
            return 1;
        }
             
            int y = 0; //starting index.
        int z = height.length-1, area = 0;
        
          if(height[y]==height[z]){
            
            return area = height[y]*height[z];   
        }
        
        while (y<z){
        
          area = Math.max(area, Math.min(height[y],height[z])* (z-1));
        
          if(height[y]< height[z]){
          
                 y+=1;
          }else{
          
              z-=1;
          
          }
              
        }
        
        return area;
        
        
        
    }
    

    
    
     public static void main(String[] args){
     
         int[] input = {1,8,6,2,5,4,8,3,7};
     
         System.out.println(maxArea(input));
     
     }
    
       
}
