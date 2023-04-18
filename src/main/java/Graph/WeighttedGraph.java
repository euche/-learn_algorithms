package Graph;

import java.util.*;

public class WeighttedGraph {
    // Class to implement Dijkstra Algorithm  for Weighted Graphs
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeighttedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void ssspPathPrint(WeightedNode node) {
        if (node.parent != null) {
            ssspPathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    void dijkstraMethod(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<WeightedNode>();
        node.distance = 0;                                          // setting intial distance to Zero, based on the intial distance we are calculating the cost of eachnode/vertex
        queue.addAll(nodeList);                                     // Enqueue all element to the priority queue
        while (!queue.isEmpty()) {
            WeightedNode currNode = queue.remove();
            for (WeightedNode neighbour : currNode.neighbors) {
                if (queue.contains(neighbour)) {                    /// if the neighbout is inside the queue means neighbout.isVisited = false;
                    if (neighbour.distance > currNode.distance + currNode.weightMap.get(neighbour)) {            /// based on the intial distance we are calculating the cost of eachnode/vertex. if the new cost is less,
                        neighbour.distance = (currNode.distance + currNode.weightMap.get(neighbour));             // we update the cost of that node, otherwise we continue to other nodes/vertex
                        neighbour.parent = currNode;          //update parent of adjacent vertices to currentNode
                        // to refresh the priority queue
                        queue.remove(neighbour);
                        queue.add(neighbour);

                    }
                }
            }
        }

        //print the table of node with minimum distance and shortest path from the source
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            ssspPathPrint(nodeToCheck);
            System.out.println();
        }


    }

    // Method to add Weighted Edges to our Graph.
    public void addWeighthedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, d);

    }

    //Bellman-ford algorithm to detect negative cycle
    void bellmanFord(WeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {   // loop through all nodes and visit all neighbours of these nodes one-by-one
                for (WeightedNode neighbour : currentNode.neighbors) {  // loop for all neighbours of the current node
                    if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {   // neighbour node distance greater than currNode distance + weights between current node and neighbour
                        neighbour.distance = currentNode.distance + currentNode.weightMap.get(neighbour);
                        neighbour.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("Checking for negative cycle...");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbour : currentNode.neighbors) {
                if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {
                    System.out.println("Negative cycle Found...\n");
                    System.out.println("Vertex/Node name" + neighbour.name);
                    System.out.println("Old cost" + neighbour.distance);
                    int newDistance = currentNode.distance + currentNode.weightMap.get(neighbour);
                    System.out.println("New Cost" + newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative cycle not found");
        //print the table of node with minimum distance and shortest path from the source
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            ssspPathPrint(nodeToCheck);
            System.out.println();
        }


    }

    // Floyd warshall algorithm

    void floydWarshall() {

        // implement matrix with the size of nodelist initialized at the beginning
        int size = nodeList.size();
        int[][] v = new int[size][size];     // matrix of V size where V is the number of Vertices

        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j) {
                    v[i][j] = 0;                             // fill the matrix where vertex meet
                } else if (first.weightMap.containsKey(second)) {                                       // if there is a direct link between 2 verticies i.e if they have edges linking them, get the distance and update the matrix
                    v[i][j] = first.weightMap.get(second);
                } else {
                    v[i][j] = Integer.MAX_VALUE / 10;                      //set the remaining vertices in the table to infinity; Integer.MAX_VALUE/10 is to prevent overflow error
                }
            }
        }

        // loop through the graph, V times, loop each time via Vertex

        for (int k = 0; k < nodeList.size(); k++) {
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < nodeList.size(); j++) {
                    if (v[i][j] > v[i][k] + v[k][j]) {                           //Logic of floyd warshall algorithm... when vertex A goes to Vertex D via Vertex C
                        v[i][j] = v[i][k] + v[k][j];
                    }
                }
            }
        }
        //Print the Shortest Path of Each Node using Matrix

        for (int i = 0; i < size; i++) {

            System.out.print("Printing distance list for node" + nodeList.get(i) + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

    }


}
