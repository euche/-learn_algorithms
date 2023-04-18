package Graph;

import java.util.ArrayList;

public class GraphNode {

    public String name;
    public int index;
    public boolean isVisited = false;
    public GraphNode parent;  // for BFS and SSSPP Solution for Adjacency Matrix

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // for Graph Traversals , future properties wil be added


}
