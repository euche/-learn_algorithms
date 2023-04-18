/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DC;

/**
 * @author Dell
 */
public class DcMain {

    public static void main(String[] args) {

//         NumberFactor s = new NumberFactor();
//         System.out.println(s.waysToGetN(6));

        ConvertString a = new ConvertString();
        System.out.println(a.findMinOperations("table", "tbres"));


        ZeroOneKnapsack d = new ZeroOneKnapsack();
        int[] profits = {31, 26, 17, 72};
        int[] weights = {3, 1, 2, 5};
        int maxProfit = d.zeroKnapsack(profits, weights, 7);
        System.out.println(maxProfit);

        LongestPalindromS e =  new LongestPalindromS();
        System.out.println(e.findLPSLength("AACDAS"));


        int [][] array = {

                {4,7,8,6,4},
                {6,7,3,9,2},
                {3,8,1,2,4},
                {7,1,7,3,7},
                {2,9,8,9,3}

        };


        MinCost aa = new MinCost();
        System.out.println(aa.findMinCost(array, array.length-1,array[0].length-1));



    }


}
