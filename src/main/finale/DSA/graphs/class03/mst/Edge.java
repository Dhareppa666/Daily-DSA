package main.finale.DSA.graphs.class03.mst;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public int compareTo(Edge other) {
        return Integer.compare(this.weight, other.weight);
    }

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}
