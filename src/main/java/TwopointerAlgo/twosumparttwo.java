/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwopointerAlgo;


import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class twosumparttwo {
    
    //using the 2 pointer techinque to solve two sum.
    
    public static int[] twoSum(int[] nums, int target) {
    
     Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args){
    
      int[] nums ={3,2,4};
         int target = 6;
         
         int[] nu = {3,0,3};
         int target1 = 6;
         
         
         System.out.println(Arrays.toString(twoSum(nu,target1)));      
    
    
    }
    
}
