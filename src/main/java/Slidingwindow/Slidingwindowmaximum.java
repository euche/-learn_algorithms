/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slidingwindow;


import java.util.*;


/**
 *
 * @author Dell
 */
public class Slidingwindowmaximum {
    
    
    public int[] maxSlidingWindow(int[] nums, int k) {
    
         int j, maxNo, n = nums.length;
         
         int[] ans = new int[n];
         
         for(int i = 0; i <= n-k;i++){                 // This Simple Method uses nested loop(2 loops)
                                            // outer loop = start point of subarray of length of K
           maxNo = nums[i];
           for(j = 1; j < k;j++){           //inner loop = start index to index + k, K elements
               if(nums[i+j] > maxNo){
                  maxNo = nums[i+j];          // finds the Maximum
               }
           
               //System.out.print(maxNo+ " ");
               ans[i] = maxNo;
           }
               
         }
          return ans;
  
    }
    
    public static ArrayList<Integer> maxSliidingWindow(int[] nums, int k){    //using AVL Tree.or Binary Heap 
                                                           //NOTE: it seems Trees are created using QUEUES or LINKEDLISTS
        int n = nums.length;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());   //  Looking like a MAX HEAP
        
        ArrayList<Integer> ews = new ArrayList<>();
        
        int i = 0;     //Intialise for all For loops
        
        for(; i<k;i++){
        queue.add(nums[i]);
       
        }
        
        //add the max element among first k elements to Arraylist
        ews.add(queue.peek());                                                     // Not my Solution....But it is OPTIMAL SOLUTION
        
        //remove the first element of array
        queue.remove(nums[0]);
        
        //iterating for next elemsnts in nums
        for(;i<n;i++){
        
            queue.add(nums[i]);
            
            ews.add(queue.peek());
            
            queue.remove(nums[i-k+1]);
        
        }
        
        
        
    return ews;
    
    }
    
    
    
    
    //QUEUE uses FIFO(First-In-First-Out)
    // A PriotityQueue is a special type of Queue where all the elements are ordered as per their NATURAL ORDERING or based on a CUSTOM COMPARATOR
    //supplied at the time of Creation
    
    
    public static void main(String[] args){
    
        int arr[] = { 1,3,-1,-3,5,3,6,7};
        int k = 3;
        
        List<Integer> res = maxSliidingWindow(arr, k);   ///PRINTING OUT AN ARRAYLIST
        for (int x : res)
            System.out.print(x + " ");
    }
        
    
    
    
}
