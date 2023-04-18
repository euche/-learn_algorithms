package Graph;


import java.util.PriorityQueue;
import java.util.*;

public class PrimAlgo {

    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public PrimAlgo(ArrayList<WeightedNode> nodeList) { //constructor
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectedEdge(int i, int j, int d) {

        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);

        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second, d);
        second.weightMap.put(first, d);

    }

    // Prim's Algorithm

    void primAlgorithm(WeightedNode node) {

        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).distance = Integer.MAX_VALUE;        // get the node/vertices setting distance/ weights of edges to Infinity
        }
        //setting the source node distance to zero
        node.distance = 0;
        //create a priorityQueue and enqueue the node elements , and remove them in ascending order, in which Minimum comes out first.

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightedNode currNode = queue.remove();            // removes the node/vertex with minimum distance
            // loop through the Neighbours/adjacent vertices of currNode
            // if in queue(Neighbours), means they have not been reached....means updating the distances of the adjacent verticies/neighbours and their parents as well

            for (WeightedNode neighbour : currNode.neighbors) {
                if (queue.contains(neighbour)) {
                    // means Neighbour have not been reached/processed
                    //update distance and parent of this neighbur, if weight of this node is more than current edge

                    if (neighbour.distance > currNode.weightMap.get(neighbour)) {
                        neighbour.distance = currNode.weightMap.get(neighbour);
                        // update the parent of neigbour to current node
                        neighbour.parent = currNode;

                        // remove Neighbour  from Priority queue / add back to refresh the Priority queue
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }


                }
            }


        }
        int cost = 0;   // loop through nodeList and print out parents and distance of nodes
         for(WeightedNode nodeToCheck : nodeList){
             System.out.println("Node "+nodeToCheck+", key "+ nodeToCheck.distance+" Parent: "+ nodeToCheck.parent);
             cost = cost + nodeToCheck.distance;
         }
         System.out.println("\n Total cost of MST: "+ cost);
    }


}
