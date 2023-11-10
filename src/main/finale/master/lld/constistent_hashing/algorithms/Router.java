package main.finale.master.lld.constistent_hashing.algorithms;

import main.finale.master.lld.constistent_hashing.models.Request;
import main.finale.master.lld.constistent_hashing.models.Node;

public interface Router {
    void addNode(Node node);

    void removeNode(Node node);

    Node getAssignedNode(Request request);
}
