package Graph;

import java.util.ArrayList;

public class Routebtwnodes {

    // Top Interview Question
    //Given a directed graph and two nodes(S and E),  design an algorithm to find out whether there is a route from S and E
    // source Cracking the coding interview

    // Pseudocode
    // = > 1 create a method/ function with 2 parameters start and end nodes
    // = > 2 create a queue and enqueue start node to it
    // = > 3 find all the neighbours of the just enqueued node and enqueue them into the queue
    // = > 4 Repeat the process until the end of the elements in the graph
    // = > 5 if during the process we encounter the destination node, we return true.
    // = > 6 mark nodes as visited

    // we create a Graph class to begin with


    public static void main(String[] args) {

        ArrayList<RbnGraphNode> nodeList = new ArrayList<>();
        nodeList.add(new RbnGraphNode("A", 0));
        nodeList.add(new RbnGraphNode("B", 1));
        nodeList.add(new RbnGraphNode("C", 2));
        nodeList.add(new RbnGraphNode("D", 3));
        nodeList.add(new RbnGraphNode("E", 4));
        nodeList.add(new RbnGraphNode("F", 5));
        nodeList.add(new RbnGraphNode("G", 6));
        nodeList.add(new RbnGraphNode("H", 7));
        nodeList.add(new RbnGraphNode("I", 8));
        nodeList.add(new RbnGraphNode("J", 9));


        RbnGraph h = new RbnGraph(nodeList);
        h.addDirectedEdge(0, 1);
        h.addDirectedEdge(0, 2);
        h.addDirectedEdge(0, 3);
        h.addDirectedEdge(1, 9);
        h.addDirectedEdge(2, 6);
        h.addDirectedEdge(4, 0);
        h.addDirectedEdge(4, 5);
        h.addDirectedEdge(5, 8);
        h.addDirectedEdge(6, 7);
        h.addDirectedEdge(6, 3);

        boolean result = h.search(nodeList.get(0),nodeList.get(4));

        System.out.print(result);


    }



}
