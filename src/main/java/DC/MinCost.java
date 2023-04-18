package DC;

public class MinCost {

    //Problem Statement-> Minimum cost to reach the last cell
    //2D Matrix is given
    // Each cell has a cost associated with it for accessing
    // we need to start from (0,0)and go till(n-1,n-1) cell
    //we can go only to right or down cell from current cell
    // find the way in which the cost is minimum

    public int findMinCost(int[][] cost , int row, int col){

        if( row ==-1 || col == -1){
             return  Integer.MAX_VALUE;
        }

        if( row == 0 && col == 0){
            return  cost[0][0];
        }

        int minCost1 = findMinCost(cost,row,col-1);
        int minCos2 = findMinCost(cost,row-1,col);
        int minCost = Integer.min(minCost1,minCos2);
        return minCost + cost[row][col];





    }






}
