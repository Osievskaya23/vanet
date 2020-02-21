package com.valentyna.vanet.graph;

public class GraphBuilder {

    public Graph build() {
        Graph graph = new Graph();

        for (int i = 1; i <= 16; i++) {
            graph.addVertex("v" + i);
        }

        graph.addEdge("v1", "v2", 0.3);
        graph.addEdge("v1", "v3", 0.1);
        graph.addEdge("v1", "v4", 0.4);

        graph.addEdge("v2", "v3", 0.2);
        graph.addEdge("v2", "v5", 0.2);
        graph.addEdge("v2", "v6", 0.3);

        graph.addEdge("v3", "v4", 0.2);
        graph.addEdge("v3", "v6", 0.3);
        graph.addEdge("v3", "v7", 0.2);

        graph.addEdge("v4", "v8", 0.3);

        graph.addEdge("v5", "v6", 0.2);
        graph.addEdge("v5", "v9", 0.6);

        graph.addEdge("v6", "v10", 0.2);

        graph.addEdge("v7", "v8", 0.3);
        graph.addEdge("v7", "v10", 0.6);
        graph.addEdge("v7", "v11", 0.3);

        graph.addEdge("v8", "v11", 0.6);
        graph.addEdge("v8", "v12", 0.6);

        graph.addEdge("v9", "v10", 0.3);
        graph.addEdge("v9", "v13", 0.6);
        graph.addEdge("v9", "v14", 0.5);

        graph.addEdge("v10", "v13", 0.2);

        graph.addEdge("v11", "v12", 0.2);
        graph.addEdge("v11", "v15", 0.4);

        graph.addEdge("v12", "v15", 0.2);

        graph.addEdge("v13", "v14", 0.3);
        graph.addEdge("v13", "v15", 0.3);
        graph.addEdge("v13", "v16", 0.2);

        graph.addEdge("v14", "v16", 0.6);

        graph.addEdge("v15", "v16", 0.3);

        return graph;
    }
}
