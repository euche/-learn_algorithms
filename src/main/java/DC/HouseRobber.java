/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DC;

/**
 *
 * @author Dell
 */
public class HouseRobber {
    
    //using Divide and conquer algorithm...
    
    //Given N number of houses along the street with a non-negative integer amount of money
    // Adjacent houses cannot be stolen. The Alarm trips off.
    //Find the maximum amount that can be stolen
    
    private int maxMoneyRecur(int[] HouseNetworth,int currentIndex){
    
        if(currentIndex > HouseNetworth.length){
           return 0;
        }
        
          int stealFromHouse = HouseNetworth[currentIndex] + maxMoneyRecur(HouseNetworth, currentIndex+2);
          int skipCurrentHouse =  maxMoneyRecur(HouseNetworth, currentIndex+1);
          
        return Math.max(stealFromHouse, skipCurrentHouse);
    }
    
    public int maxMoney(int[] HouseNetworth){
      return maxMoneyRecur(HouseNetworth,0);
    }
    
    
}
