package Graph;

import java.util.*;
public class RbnGraph {

    // Top Interview Question  Route between nodes
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



    // A Graph class for solving the algorithm question Route between nodes

    static ArrayList<RbnGraphNode>  nodelist = new ArrayList<RbnGraphNode>();

    public enum State{
        unvisited,visited, visiting
    }

    public RbnGraph(ArrayList<RbnGraphNode> nodeList) {
        nodelist = nodeList;
    }

    public void addDirectedEdge(int i, int j){
        RbnGraphNode first = nodelist.get(i);
        RbnGraphNode second = nodelist.get(j);
        first.neighbours.add(second);
    }

    public static boolean search(RbnGraphNode start, RbnGraphNode end){
        LinkedList<RbnGraphNode> queue = new LinkedList<>();  //initialising the queue

        for ( RbnGraphNode node : nodelist){
            node.state = State.unvisited;     // set all nodes in nodelist to unvisited.
        }
        start.state = State.visiting;     //set default state to visiting before enqueuing to queue
        queue.add(start);

        RbnGraphNode currNode;
        while (!queue.isEmpty()){

            currNode = queue.removeFirst();
            if (currNode != null){
                for(RbnGraphNode n: currNode.neighbours){
                    // check if the state of neighbours is unvisitied
                    if(n.state == State.unvisited){
                        if(n == end){
                            return true;
                        }else{
                           n.state = State.visiting;
                            queue.add(n);
                        }
                    }
                }
                currNode.state = State.visited;
            }

        }
        return  false;

    }





}
