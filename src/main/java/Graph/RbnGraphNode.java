package Graph;

import java.util.*;

public class RbnGraphNode {
    // A GraphNode class for solving the algorithm question Route between nodes
    public String name;
    public int index;
    public boolean isvisited = false;
    public RbnGraphNode parent;
    public RbnGraph.State state;

    public ArrayList<RbnGraphNode> neighbours = new ArrayList<RbnGraphNode>();

    public RbnGraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
