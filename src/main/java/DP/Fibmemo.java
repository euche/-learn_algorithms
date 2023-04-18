/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

import java.util.*;

/**
 *
 * @author Dell
 */
//   Fibonnaci example _-> Dynamic Programming-> Top down memoization
public class Fibmemo {
    
    public static int fibMemo(int n, HashMap<Integer,Integer> memo){
    
        if(n == 1){
         return 0;
        }
        
        if(n == 2){
         return 1;
        }
        
        // if n is not in the Hashmap, put in hashmap.
        
        if(!memo.containsKey(n)){
           memo.put(n,(fibMemo(n-1,memo)+fibMemo(n-2,memo)));  
        
        } 
        
        return memo.get(n);
    }
    //uses recursion
    
    public static int fibTab(int n){   //using arraylist and adding fib(1)and fib(2) to the arraylist
        ArrayList<Integer> tb = new ArrayList<Integer>();
        tb.add(0);
        tb.add(1);
        
        for(int i = 2;i < n-1;i++){
          int n1 = tb.get(i-1);
          int n2 = tb.get(i-2);
          tb.add(n1+n2);
            
        }
        
      return(tb.get(n-1));  
    }
    
    
    //   Fibonnaci example _-> Dynamic Programming-> BOTTOM-UP TABULATION
    
    
    
    
    
    public static void main(String[] args){
        
        HashMap<Integer,Integer> memo = new HashMap<Integer,Integer>();
        System.out.println(fibMemo(20,memo));
        

    }
}
