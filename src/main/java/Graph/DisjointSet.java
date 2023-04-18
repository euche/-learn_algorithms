package Graph;

import java.util.*;

public class DisjointSet {
    // Disjoint Set Data Structure, also Known as Union Find Data Structure...is used in Minimum Spanning Tree

    public ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public static void makeSet(ArrayList<WeightedNode> nodeList) {      // one of the Major Operations in  Disjoint set
        for (WeightedNode node : nodeList) {
            DisjointSet set = new DisjointSet();
            set.nodeList.add(node);
            node.set = set;
        }
    }

    public static DisjointSet findSet(WeightedNode node) {
        return node.set;
    }

    public static DisjointSet union(WeightedNode node1, WeightedNode node2) {
        if (node1.set.equals(node2.set)) {
            return null;
        } else {
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;

            if (set1.nodeList.size() > set2.nodeList.size()) {
                ArrayList<WeightedNode> nodesSet2 = set2.nodeList;

                for (WeightedNode node : nodesSet2) {
                    node.set = set1;
                    set1.nodeList.add(node);
                }
                  return set1;
            }else{
                ArrayList<WeightedNode> nodesSet1 = set1.nodeList;
                for (WeightedNode node : nodesSet1) {
                    node.set = set2;
                    set2.nodeList.add(node);
                }
               return  set2;
            }

        }
    }

    // Helper Function/Method to print out node of the set in the Disjoint set class

    public void printAllNodeOfSet(){
        System.out.println("Printing all nodes of the set: ");
        for (WeightedNode node : nodeList){
            System.out.print(node+" ");
        }
        System.out.println();
    }



}
