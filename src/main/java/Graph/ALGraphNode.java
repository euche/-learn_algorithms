package Graph;

import java.util.ArrayList;

public class ALGraphNode {


    public String name;
    public int index;
    public boolean isVisited = false;
    public ALGraphNode parent; // BFS for SSSPP  extra property

    public ALGraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // for Graph Traversals , future properties wil be added


    // Neighbours as arraylist
    // if a node has an edge to other nodes

    public ArrayList<ALGraphNode> neighbours = new ArrayList<ALGraphNode>();   // for adjacency list



}
