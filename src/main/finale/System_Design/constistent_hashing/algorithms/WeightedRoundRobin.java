package main.finale.System_Design.constistent_hashing.algorithms;


import main.finale.System_Design.constistent_hashing.algorithms.Router;
import main.finale.System_Design.constistent_hashing.models.Node;
import main.finale.System_Design.constistent_hashing.models.Request;

import java.util.ArrayList;
import java.util.List;

public class WeightedRoundRobin implements Router {
    private final List<Node> nodes;
    private int assignTo;
    private int currentNodeAssignments;
    private final Object lock;

    public WeightedRoundRobin() {
        this.nodes = new ArrayList<>();
        this.assignTo = 0;
        this.lock = new Object();
    }

    public void addNode(Node node) {
        synchronized (this.lock) {
            nodes.add(node);
        }
    }

    public void removeNode(Node node) {
        synchronized (this.lock) {
            nodes.remove(node);
            assignTo--;
            currentNodeAssignments = 0;
        }
    }

    public Node getAssignedNode(Request request) {
        synchronized (this.lock) {
            assignTo = (assignTo + nodes.size()) % nodes.size();
            final Node currentNode = nodes.get(assignTo);
            currentNodeAssignments++;
            if (currentNodeAssignments == currentNode.getWeight()) {
                assignTo++;
                currentNodeAssignments = 0;
            }
            return currentNode;
        }
    }
}