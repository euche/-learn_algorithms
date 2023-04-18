package DC;

public class ZeroOneKnapsack {

    //Problem Statement
    //Given the weights and profits of N items
    //Find the maximum profit within given capacity of C
    //Items  cannot be broken
    //Put the Items in a Knapsack with a capcity of C

    private int zeroKnapsack(int[] profits, int[] weights, int capacity, int currIndex) {

        if (capacity <= 0 || currIndex < 0 || currIndex >= profits.length) {   // Conditions to stop the recursive loops
            return 0;
        }

        int profit1 = 0;
        if (weights[currIndex] < capacity) {
            profit1 = profits[currIndex] + zeroKnapsack(profits, weights, capacity - weights[currIndex], currIndex + 1); // when inserting an item, capacity reduces, so we subtract capacity from current item weight
        }
        int profit2 = zeroKnapsack(profits, weights, capacity, currIndex + 1);

        return Math.max(profit1, profit2);
    }


    public int zeroKnapsack(int[] profits, int[] weights, int capacity) {
        return this.zeroKnapsack(profits, weights, capacity, 0);
    }


}
