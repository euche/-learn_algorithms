package Graph;

import java.util.*;

public class KruskalAlgo {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    ArrayList<UndirectedEdge> edgeList = new ArrayList<>();

    public KruskalAlgo(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedNode firstTemp = edge.firstNode;
        WeightedNode secondTemp = edge.secondNode;
        firstTemp.neighbors.add(secondTemp);
        secondTemp.neighbors.add(firstTemp);

        firstTemp.weightMap.put(secondTemp, weight);
        secondTemp.weightMap.put(firstTemp, weight);

        edgeList.add(edge);
    }

    void KruskalAlg() {
        DisjointSet.makeSet(nodeList);

        //sort edges in ascending order   // following code in Lambda expression
//        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
//            @Override
//            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
//                return 0;
//            }
//        };


        Comparator<UndirectedEdge> comparator = (Comparator<UndirectedEdge>) (o1, o2) -> o1.weight - o2.weight;

        Collections.sort(edgeList, comparator);                                         // sort edges based on the comparator

        int cost = 0;
        for (UndirectedEdge edge : edgeList) {
            WeightedNode first = edge.firstNode;
            WeightedNode second = edge.secondNode;
            // if the 2 nodes above are not located in the same set, Union them

            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += edge.weight;     // increase/ add weights
                System.out.println("Taken " + edge);

            }

        }

        System.out.println("\n Total cost of MST: " + cost);
    }

}
