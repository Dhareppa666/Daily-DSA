package main.finale.System_Design.constistent_hashing.models;

import main.finale.System_Design.constistent_hashing.algorithms.Router;

public class Service {
    private final Router router;
    private final String id;
    private final String[] methods;

    public Service(String id, Router router, String[] methods) {
        this.router = router;
        this.id = id;
        this.methods = methods;
    }

    public Router getRouter() {
        return router;
    }

    public String getId() {
        return id;
    }

    public String[] getMethods() {
        return methods;
    }
}
