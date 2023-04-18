/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;
/**
 *
 * @author Dell
 */
public class NumberFactor {
    
//    Problem statement. Given N, find the number of ways to express N as a sum of 1,3 and 4
    
    
    private int waysToGetNtopDown(int[] dp, int N){
        
        if(N==0||N ==1||N==2){
           return 1;
        }
        if (N == 3)
                return 2;
     
       
        if(dp[N] == 0){  // if Array is empty
           int ans1 = waysToGetNtopDown(dp, N-1);
           int ans2 = waysToGetNtopDown(dp, N-3);
           int ans3 = waysToGetNtopDown(dp, N-4);
           
           dp[N] = ans1+ans2+ans3;
        }
        
     return dp[N];   
    }
    
    public int waysToGetNtopDown(int n){
    
        int dp[] = new int[n+1];
        return waysToGetNtopDown(dp,n);
    }
    
    
    
    //Bottom up
    
    public int waysToGetNBottomUp(int n){
      int dp[] = new int[n+1];
      dp[0]=dp[1]=dp[2] = 1;
      dp[3] = 2;
      for(int i =4; i <= n; i++){
       // append in array
       dp[i] = dp[i-1]+dp[i-3]+dp[i-4];
      }
        
       return dp[n];
    }
    
    
    
    
    
    
    
}
