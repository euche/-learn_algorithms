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
public class HouseRobber {
//    Problem statement -> Given the number of houses along the street with some amount of money
//   Adjacent houses cannot be touched
//   find the amount that can be stolen    
    
    
    public int maxMoneyTopDown(int[] HouseNetWorth){
        // create new Array
        int dp[] = new int[HouseNetWorth.length];
        return maxMoneyTopDown(dp,HouseNetWorth,0);
    
    }
    
    private int maxMoneyTopDown(int dp[],int[] HouseNetWorth,int currentIndex){
        if(currentIndex >= HouseNetWorth.length ){
            return 0;
        }
        
        if(dp[currentIndex] == 0){
             int stealCurrent = HouseNetWorth[currentIndex]+maxMoneyTopDown(dp,HouseNetWorth,currentIndex+2);
             int skipCurrent = maxMoneyTopDown(dp,HouseNetWorth,currentIndex+1);
             dp[currentIndex] = Math.max(skipCurrent, stealCurrent);
            
        }   
        return dp[currentIndex];    
    } 
    
    public int maxMoneyBottomUp(int[] wealth){
        int[] dp = new int[wealth.length+2];
        dp[wealth.length] =0;  // if there are no houses, the thief cannot steal anything
        // reversal of top down 
        for(int i = wealth.length - 1;i >= 0;i--){
            dp[i] = Math.max(wealth[i]+dp[i+2], dp[i+1]);
        }
        return dp[0];
    }
    
}
