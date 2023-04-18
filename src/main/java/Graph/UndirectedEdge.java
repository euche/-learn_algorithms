package Graph;

public class UndirectedEdge {
    public WeightedNode firstNode;
    public WeightedNode secondNode;
    public int weight;

    public UndirectedEdge(WeightedNode firstNode, WeightedNode secondNode, int weight) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge (" + firstNode +","+ secondNode +"), weight ="+ weight;
    }
}
