package Graph;

import java.util.*;

public class WeightedNode implements Comparable<WeightedNode> {
    // For Implementation of Dijikstra Algorithm in Java

    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<>();
    public HashMap<WeightedNode, Integer> weightMap = new HashMap<>();   // save weights of edges
    public Boolean isVisited = false;
    public WeightedNode parent;

    public DisjointSet set; // Extra new Property for DisjointSet Class

    public int distance;

    public int index;

    public WeightedNode(String name) {
        this.name = name;
        distance = Integer.MAX_VALUE;    //Infinity
    }

    public WeightedNode(String name, int index) {
        this.name = name;
        distance = Integer.MAX_VALUE;    //Infinity
        this.index = index;

    }

    @Override
    public String toString() {     // print weightted node, it will print out the name
        return name;
    }


    // Method to compare nodes when using priority queue
    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;   // O in this case is the object to be compared
    }

}
