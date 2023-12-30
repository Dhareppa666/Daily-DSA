package main.finale.System_Design.constistent_hashing.algorithms;

import main.finale.aa.System_Design.constistent_hashing.models.Node;
import main.finale.aa.System_Design.constistent_hashing.models.Request;

public interface Router {
    void addNode(Node node);

    void removeNode(Node node);

    Node getAssignedNode(Request request);
}
