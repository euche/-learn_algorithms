/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bits;


import java.util.*;

/**
 *
 * @author Dell
 */
public class cinemaseatalloc {
    
 // codilty question Cinema Seat Allocation/ plane reservation allocation
    
    // for the plane reservation solution, they are similar. we will most likely represent the Alphabets as numbers

// More on bitwise operators https://www.geeksforgeeks.org/bitwise-operators-in-java/


 public int maxNumberrOfFamilies(int n, int[][] reservedSeats) {
      HashMap<Integer,Integer> map=new HashMap();
      int count=0;
      for(int[] i:reservedSeats){
          int row = i[0]-1;
          int seat = i[1];
          map.put(row,map.getOrDefault(row,0)|1<<seat);
      }
      for(int p:map.values()){
           int left=((p>>2)&1)+((p>>3)&1)+((p>>4)&1)+((p>>5)&1);
           int right=((p>>6)&1)+((p>>7)&1)+((p>>8)&1)+((p>>9)&1);
           int middle=((p>>4)&1)+((p>>5)&1)+((p>>6)&1)+((p>>7)&1);
            if(left==0&&right==0){
                count+=2;
            }
            else if(left==0||right==0||middle==0){
                count+=1;
            }}
      return count+(n-map.size())*2;
        }
    



}
    
    
