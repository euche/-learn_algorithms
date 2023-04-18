package Numberarray;



public class besttimetosellstock {
    //Leetcode Easy problem



    // => Best Time to Buy and Sell Stock

    // You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

    // My Solution does not pass 11 testcases out of 211

    // int mp =0;

    //for (int i = 0; i < prices.length;i++ ){
    //
    //   for(int j =i+1; j < prices.length;j++){
    //
    //    if(prices[i] < prices[j]){
    //
    //     mp = Math.max(mp, Math.abs(prices[i]-prices[j]));
    //
    //    }
    //
    //
    //   }
    //
    // }
    //
    //   return mp;
    //
    //
    // }

    public int maxProfit(int[] prices) {


        int mp = 0;
        int fi = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (fi > prices[i]) {

                fi = prices[i];
            } else if (prices[i] - fi > mp) {
                mp = prices[i] - fi;
            }
        }
        return mp;
    }


}
