package Graph;

import java.util.ArrayList;
import java.util.*;

public class Graph {

    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>(); // For adjacency matrix

    int[][] adjacencyMatrix;


    public Graph(ArrayList<GraphNode> nodeList) {   // adjacency matrix will be initialized based on the size of the node. if the size of nodes = 5,
        this.nodeList = nodeList;               // it will be a 5 * 5 matrix
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];  // default values in matrix = 0
    }

    public void addUndirectedEdge(int i, int j) {   //values(Edges) between matrices. that populate the Matrix
        adjacencyMatrix[i][j] = 1;              // it indicates 2-way connection
        adjacencyMatrix[j][i] = 1;
    }

    public String toString() {   // to print values of Graph to console
        StringBuilder s = new StringBuilder();
        s.append(" ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    // get Neighbours

    public ArrayList<GraphNode> getNeighbours(GraphNode node) {
        ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();

        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }

    //Breadfirst search internal method

    void bfsVisit(GraphNode h) {
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(h);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for (GraphNode neighbour : neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }

        }
    }

    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }


    //Depth Search Internal Method/ Algorithm
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            GraphNode currNode = stack.pop();   // pop() removes the top element from the stack
            currNode.isVisited = true;
            System.out.print(currNode.name + " ");
            ArrayList<GraphNode> neighbours = getNeighbours(currNode);
            for (GraphNode neighbour : neighbours) {
                if (!neighbour.isVisited) {
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }


    }


    // main DFS method/ Outer Method
    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }


    // Topological sort Method implementation

    public void addDirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;     // this indicated one way connection between Vertices/Nodes

    }


    void topologicalSortVisit(GraphNode node, Stack<GraphNode> s) {   // Helper method that is the translation of the pseudocode
        ArrayList<GraphNode> neighbours = getNeighbours(node);

        for (GraphNode neighbour : neighbours) {
            if (!neighbour.isVisited) {
                topologicalSortVisit(neighbour, s);
            }
        }
        node.isVisited = true;
        s.push(node);
    }


    void topologicalSort() {
        Stack<GraphNode> stack = new Stack<GraphNode>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalSortVisit(node, stack);
            }
        }

        // print out nodes in the Stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }

    }

    // BFS Algorithm for SSSPP
    public void ssspPathPrint(GraphNode node) {
        if (node.parent != null) {
            ssspPathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void BfsForSSSPP(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode currNode = queue.remove(0);
            currNode.isVisited = true;
            System.out.print("Printing Path for node" + currNode.name + ": ");
            ssspPathPrint(currNode);
            System.out.println();

            ArrayList<GraphNode> neighbours = getNeighbours(currNode);
            for (GraphNode neighbour : neighbours) {

                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                    neighbour.parent = currNode;
                }

            }
        }
    }


}
