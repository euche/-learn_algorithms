package Graph;

import java.util.ArrayList;
import java.util.*;

public class ALGraph {
    ArrayList<ALGraphNode> nodeList = new ArrayList<>(); // For adjacency list

    public ALGraph(ArrayList<ALGraphNode> nodeList) {
        this.nodeList = nodeList;
    }


    public void addUndirectedEdge(int i, int j) {
        ALGraphNode first = nodeList.get(i);
        ALGraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }


    public String toString() {   // to print values of Graph
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.get(i).neighbours.size(); j++) {
                if (j == nodeList.get(i).neighbours.size() - 1) {
                    s.append((nodeList.get(i).neighbours.get(j).name));
                } else {
                    s.append((nodeList.get(i).neighbours.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    //BFS internal method
    void bfsVisit(ALGraphNode node) {
        LinkedList<ALGraphNode> queue = new LinkedList<ALGraphNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            ALGraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (ALGraphNode neighbour : currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (ALGraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }


    // Depth first search internal method

    void dfsVisit(ALGraphNode node) {
        // this works based on Stack Data structure.
        Stack<ALGraphNode> stack = new Stack<ALGraphNode>();
        stack.push(node);
        while (!stack.isEmpty()) {
            ALGraphNode currNode = stack.pop();
            currNode.isVisited = true;
            System.out.print(currNode.name + " ");
            for (ALGraphNode nnode : currNode.neighbours) {
                if (!nnode.isVisited) {
                    stack.push(nnode);
                    nnode.isVisited = true;

                }

            }
        }
    }


    // DFS outer Method/ main method
    public void dfs() {
        for (ALGraphNode n : nodeList) {
            if (!n.isVisited) {
                dfsVisit(n);
            }
        }
    }


    // Topological Sort

    // First we are going to have a method to add Directed Edges

    public void addDirectedEdge(int vertex1, int vertex2) {   // this is to insert values
        ALGraphNode first = nodeList.get(vertex1);   // fetching first index
        ALGraphNode second = nodeList.get(vertex2);  // fetching second index

        first.neighbours.add(second);
    }

    //Topological sort Internal
    void topologicalVisit(ALGraphNode node, Stack<ALGraphNode> stack) {  // For this, we wil use Stack Data structure
        for (ALGraphNode neighbour : node.neighbours) {
            if (!neighbour.isVisited) {
                topologicalVisit(neighbour, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }


    void topologicalSort() {
        Stack<ALGraphNode> stack = new Stack<ALGraphNode>();
        for (ALGraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name + " ");
        }


    }

    // Breath First Search Algorithm for Single Source Shortest Path Problem

    public void ssspPathPrint(ALGraphNode node) {
        if (node.parent != null) {
            ssspPathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void BfsForSSSPP(ALGraphNode node) {

        LinkedList<ALGraphNode> queue = new LinkedList<ALGraphNode>();
        queue.add(node);                          //Enqueue
        while (!queue.isEmpty()) {
            ALGraphNode currNode = queue.remove(0);       //dequeue, is currNode visited? mark as visiited
            currNode.isVisited = true;
            System.out.print("Printing Path for node" + currNode.name + ": ");
            ssspPathPrint(currNode);
            System.out.println();
            for (ALGraphNode neighbour : currNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);                   //enqueue all adjacent verticies of currNode(neighbours of currNode)
                    neighbour.isVisited = true;
                    neighbour.parent = currNode;             //update parent of adjacent vertices to currNode
                }
            }
        }


    }


}
