package Graph;

import java.util.ArrayList;

public class GraphMain {

    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);

        //   System.out.println(g.toString());   // print undirectedEdges for adjacency matrix

        ArrayList<ALGraphNode> istnodeList = new ArrayList<ALGraphNode>();
        istnodeList.add(new ALGraphNode("A", 0));
        istnodeList.add(new ALGraphNode("B", 1));
        istnodeList.add(new ALGraphNode("C", 2));
        istnodeList.add(new ALGraphNode("D", 3));
        istnodeList.add(new ALGraphNode("E", 4));

        ALGraph gg = new ALGraph(istnodeList);
        gg.addUndirectedEdge(0, 1);
        gg.addUndirectedEdge(0, 2);
        gg.addUndirectedEdge(0, 3);
        gg.addUndirectedEdge(1, 4);
        gg.addUndirectedEdge(2, 3);
        gg.addUndirectedEdge(3, 4);

        //  System.out.println(gg.toString()); //print adjacencyList


        //  g.bfs(); //bfs traversal for adjacency matrix
        // gg.bfs(); // bfs traversal for adjacency List

        //  gg.dfs();  // dfs traversal for adjacency List

        // g.dfs();  // dfs traversal for adjacency matrix


        // Testing Topological Sort (Adjacency List)
        ArrayList<ALGraphNode> sndnodeList = new ArrayList<ALGraphNode>();
        sndnodeList.add(new ALGraphNode("A", 0));
        sndnodeList.add(new ALGraphNode("B", 1));
        sndnodeList.add(new ALGraphNode("C", 2));
        sndnodeList.add(new ALGraphNode("D", 3));
        sndnodeList.add(new ALGraphNode("E", 4));
        sndnodeList.add(new ALGraphNode("F", 5));
        sndnodeList.add(new ALGraphNode("G", 6));
        sndnodeList.add(new ALGraphNode("H", 7));

        ALGraph h = new ALGraph(sndnodeList);
        h.addDirectedEdge(0, 2);
        h.addDirectedEdge(2, 4);
        h.addDirectedEdge(4, 7);
        h.addDirectedEdge(4, 5);
        h.addDirectedEdge(5, 6);
        h.addDirectedEdge(1, 2);
        h.addDirectedEdge(1, 3);
        h.addDirectedEdge(3, 5);

        //   System.out.println(h.toString());// For Adjacency List
        //   h.topologicalSort();


        //Testing Topological sort (Adjacency Matrix)
        ArrayList<GraphNode> ThirdnodeList = new ArrayList<GraphNode>();
        ThirdnodeList.add(new GraphNode("A", 0));
        ThirdnodeList.add(new GraphNode("B", 1));
        ThirdnodeList.add(new GraphNode("C", 2));
        ThirdnodeList.add(new GraphNode("D", 3));
        ThirdnodeList.add(new GraphNode("E", 4));
        ThirdnodeList.add(new GraphNode("F", 5));
        ThirdnodeList.add(new GraphNode("G", 6));
        ThirdnodeList.add(new GraphNode("H", 7));

        Graph jj = new Graph(ThirdnodeList);
        jj.addDirectedEdge(0, 2);
        jj.addDirectedEdge(2, 4);
        jj.addDirectedEdge(4, 7);
        jj.addDirectedEdge(4, 5);
        jj.addDirectedEdge(5, 6);
        jj.addDirectedEdge(1, 2);
        jj.addDirectedEdge(1, 3);
        jj.addDirectedEdge(3, 5);

//        System.out.println(jj.toString());
//        jj.topologicalSort();


        // Testing Single Source Shortest Path Problem with BFS on Adjacency List

        ArrayList<ALGraphNode> fourthnodeList = new ArrayList<ALGraphNode>();
        fourthnodeList.add(new ALGraphNode("A", 0));
        fourthnodeList.add(new ALGraphNode("B", 1));
        fourthnodeList.add(new ALGraphNode("C", 2));
        fourthnodeList.add(new ALGraphNode("D", 3));
        fourthnodeList.add(new ALGraphNode("E", 4));
        fourthnodeList.add(new ALGraphNode("F", 5));
        fourthnodeList.add(new ALGraphNode("G", 6));

        ALGraph nG = new ALGraph(fourthnodeList);
        nG.addUndirectedEdge(0, 1);
        nG.addUndirectedEdge(0, 2);
        nG.addUndirectedEdge(1, 3);
        nG.addUndirectedEdge(1, 6);
        nG.addUndirectedEdge(2, 3);
        nG.addUndirectedEdge(2, 4);
        nG.addUndirectedEdge(3, 5);
        nG.addUndirectedEdge(4, 5);
        nG.addUndirectedEdge(5, 6);

        //   nG.BfsForSSSPP(fourthnodeList.get(0));    // first node in fourthnodelist


// Testing Single Source Shortest Path Problem with BFS on Adjacency Matrix

        ArrayList<GraphNode> fifthnodeList = new ArrayList<GraphNode>();
        fifthnodeList.add(new GraphNode("A", 0));
        fifthnodeList.add(new GraphNode("B", 1));
        fifthnodeList.add(new GraphNode("C", 2));
        fifthnodeList.add(new GraphNode("D", 3));
        fifthnodeList.add(new GraphNode("E", 4));
        fifthnodeList.add(new GraphNode("F", 5));
        fifthnodeList.add(new GraphNode("G", 6));

        Graph nj = new Graph(fifthnodeList);
        nj.addUndirectedEdge(0, 1);
        nj.addUndirectedEdge(0, 2);
        nj.addUndirectedEdge(1, 3);
        nj.addUndirectedEdge(1, 6);
        nj.addUndirectedEdge(2, 3);
        nj.addUndirectedEdge(2, 4);
        nj.addUndirectedEdge(3, 5);
        nj.addUndirectedEdge(4, 5);
        nj.addUndirectedEdge(5, 6);

        //  nj.BfsForSSSPP(fifthnodeList.get(0));


        // Testing Dijkstra Algorithm for Weighted Graph

        ArrayList<WeightedNode> sixthNodelist = new ArrayList<WeightedNode>();
        sixthNodelist.add(new WeightedNode("A",0));
        sixthNodelist.add(new WeightedNode("B",1));
        sixthNodelist.add(new WeightedNode("C",2));
        sixthNodelist.add(new WeightedNode("D",3));
        sixthNodelist.add(new WeightedNode("E",4));
        sixthNodelist.add(new WeightedNode("F",5));
        sixthNodelist.add(new WeightedNode("G",6));

        WeighttedGraph nh = new WeighttedGraph(sixthNodelist);

        nh.addWeighthedEdge(0,1,2);
        nh.addWeighthedEdge(0,2,5);
        nh.addWeighthedEdge(1,2,6);
        nh.addWeighthedEdge(1,3,1);
        nh.addWeighthedEdge(1,4,3);
        nh.addWeighthedEdge(2,5,8);
        nh.addWeighthedEdge(3,4,4);
        nh.addWeighthedEdge(4,6,9);
        nh.addWeighthedEdge(5,6,7);

    //    System.out.println("Printing Dijkstra from source A");
     //   nh.dijkstraMethod(sixthNodelist.get(0));
      //  System.out.println("Printing Bellman fordAlgorithm from source A");
    //   nh.bellmanFord(sixthNodelist.get(0));

        // Testing Floyd warshall Algorithm

        ArrayList<WeightedNode> seventhNodelist = new ArrayList<WeightedNode>();
        seventhNodelist.add(new WeightedNode("A",0));
        seventhNodelist.add(new WeightedNode("B",1));
        seventhNodelist.add(new WeightedNode("C",2));
        seventhNodelist.add(new WeightedNode("D",3));

        WeighttedGraph fw = new WeighttedGraph(seventhNodelist);

        fw.addWeighthedEdge(0,3,1);   // add weighted edges, Inserting Edges from an Example.
        fw.addWeighthedEdge(0,1,8);
        fw.addWeighthedEdge(1,2,1);
        fw.addWeighthedEdge(2,0,4);
        fw.addWeighthedEdge(3,1,2);
        fw.addWeighthedEdge(3,2,9);
//        System.out.println("Printing Floyd Warshall Algorithm from source A");
//        fw.floydWarshall();

       // Testing Disjoint set for Minimum spanning Tree (Graph)

        ArrayList<WeightedNode> eighthNodelist = new ArrayList<WeightedNode>();

        eighthNodelist.add(new WeightedNode("A"));
        eighthNodelist.add(new WeightedNode("B"));
        eighthNodelist.add(new WeightedNode("C"));
        eighthNodelist.add(new WeightedNode("D"));

        // make a disjoint set
        DisjointSet.makeSet(eighthNodelist);
        WeightedNode firstNode = eighthNodelist.get(0);
        WeightedNode secondNode = eighthNodelist.get(1);

        DisjointSet output = DisjointSet.findSet(secondNode);

//        output.printAllNodeOfSet();
//
//        DisjointSet.union(firstNode,secondNode);
//        output = DisjointSet.findSet(secondNode);
//        output.printAllNodeOfSet();

       // Testing Kruskal Algorithm for Minimum spanning tree(Graph)
        ArrayList<WeightedNode> ninthNodelist = new ArrayList<WeightedNode>();
        ninthNodelist.add(new WeightedNode("A"));
        ninthNodelist.add(new WeightedNode("B"));
        ninthNodelist.add(new WeightedNode("C"));
        ninthNodelist.add(new WeightedNode("D"));
        ninthNodelist.add(new WeightedNode("E"));

        KruskalAlgo graph = new KruskalAlgo(ninthNodelist);
        graph.addWeightedUndirectedEdge(0,1,5);
        graph.addWeightedUndirectedEdge(0,2,13);
        graph.addWeightedUndirectedEdge(0,4,15);
        graph.addWeightedUndirectedEdge(1,2,10);
        graph.addWeightedUndirectedEdge(1,3,8);
        graph.addWeightedUndirectedEdge(2,3,6);
        graph.addWeightedUndirectedEdge(2,4,20);

//        System.out.print("Running Kruskal Algorithm on the Graph");
//        graph.KruskalAlg();

       // testing Prims Algorithm for Minimum spanning Tree(Graph)
        ArrayList<WeightedNode> tenthNodelist = new ArrayList<WeightedNode>();
        tenthNodelist.add(new WeightedNode("A"));
        tenthNodelist.add(new WeightedNode("B"));
        tenthNodelist.add(new WeightedNode("C"));
        tenthNodelist.add(new WeightedNode("D"));
        tenthNodelist.add(new WeightedNode("E"));

        PrimAlgo grapgh = new PrimAlgo(tenthNodelist);
        grapgh.addWeightedUndirectedEdge(0,1,5);
        grapgh.addWeightedUndirectedEdge(0,2,13);
        grapgh.addWeightedUndirectedEdge(0,4,15);
        grapgh.addWeightedUndirectedEdge(1,2,10);
        grapgh.addWeightedUndirectedEdge(1,3,8);
        grapgh.addWeightedUndirectedEdge(2,3,6);
        grapgh.addWeightedUndirectedEdge(2,4,20);
        System.out.print("Running Prims Algorithm on the Graph");
        grapgh.primAlgorithm(tenthNodelist.get(4));


    }


}
