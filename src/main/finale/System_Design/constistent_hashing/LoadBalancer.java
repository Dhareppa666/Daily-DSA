package main.finale.System_Design.constistent_hashing;

import main.finale.System_Design.constistent_hashing.models.Node;
import main.finale.System_Design.constistent_hashing.models.Request;
import main.finale.System_Design.constistent_hashing.models.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoadBalancer {
    private final Map<String, Service> services;
    private final Map<String, Node> nodes;

    public LoadBalancer() {
        this.services = new ConcurrentHashMap<>();
        this.nodes = new ConcurrentHashMap<>();
    }

    public void register(Service service) {
        services.put(service.getId(), service);
    }

    public void addNode(String serviceId, Node node) {
        nodes.put(node.getId(), node);
        services.get(serviceId).getRouter().addNode(node);
    }

    public void removeNode(String serviceId, String nodeId) {
        services.get(serviceId).getRouter().removeNode(nodes.remove(nodeId));
    }

    public Node getHandler(Request request) {
        return services.get(request.getServiceId()).getRouter().getAssignedNode(request);
    }
}
