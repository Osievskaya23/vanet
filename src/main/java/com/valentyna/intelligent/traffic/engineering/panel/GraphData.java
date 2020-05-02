package com.valentyna.intelligent.traffic.engineering.panel;

public class GraphData {

    private final int firstGraphVerticesAmount = 16;
    private final String[][] firstGraph = new String[][]{
            {"v1", "v2", "0.3"},
            {"v1", "v3", "0.1"},
            {"v1", "v4", "0.4"},
            {"v2", "v3", "0.2"},
            {"v2", "v5", "0.2"},
            {"v2", "v6", "0.3"},
            {"v3", "v4", "0.2"},
            {"v3", "v6", "0.3"},
            {"v3", "v7", "0.2"},
            {"v4", "v8", "0.3"},
            {"v5", "v6", "0.2"},
            {"v5", "v9", "0.6"},
            {"v6", "v10", "0.2"},
            {"v7", "v8", "0.3"},
            {"v7", "v10", "0.6"},
            {"v7", "v11", "0.3"},
            {"v8", "v11", "0.6"},
            {"v8", "v12", "0.6"},
            {"v9", "v10", "0.3"},
            {"v9", "v13", "0.6"},
            {"v9", "v14", "0.5"},
            {"v10", "v13", "0.2"},
            {"v11", "v12", "0.1"},
            {"v11", "v15", "0.4"},
            {"v12", "v15", "0.2"},
            {"v13", "v14", "0.3"},
            {"v13", "v15", "0.3"},
            {"v13", "v16", "0.2"},
            {"v14", "v16", "0.6"},
            {"v15", "v16", "0.3"}
    };
    private final int secondGraphVerticesAmount = 21;
    private final String[][] secondGraph = new String[][]{
            {"v1", "v2", "0.1"},
            {"v1", "v2", "0.2"},
            {"v1", "v8", "0.1"},
            {"v2", "v3", "0.2"},
            {"v2", "v4", "0.4"},
            {"v3", "v7", "0.2"},
            {"v4", "v5", "0.4"},
            {"v4", "v6", "0.3"},
            {"v5", "v21", "0.2"},
            {"v5", "v6", "0.1"},
            {"v6", "v7", "0.1"},
            {"v7", "v11", "0.8"},
            {"v8", "v9", "0.2"},
            {"v8", "v10", "0.3"},
            {"v9", "v13", "0.9"},
            {"v9", "v10", "0.2"},
            {"v10", "v11", "0.5"},
            {"v11", "v12", "0.2"},
            {"v11", "v13", "0.3"},
            {"v12", "v14", "0.7"},
            {"v13", "v15", "0.4"},
            {"v13", "v14", "0.4"},
            {"v14", "v16", "0.3"},
            {"v15", "v17", "0.2"},
            {"v15", "v21", "0.3"},
            {"v16", "v17", "0.3"},
            {"v17", "v18", "0.3"},
            {"v17", "v19", "0.3"},
            {"v17", "v20", "0.1"},
            {"v18", "v19", "0.2"},
            {"v19", "v20", "0.1"},
            {"v20", "v21", "0.4"}
    };
    private final int thirdGraphVerticesAmount = 9;
    private final String[][] thirdGraph = new String[][]{
            {"v1", "v2", "0.9"},
            {"v1", "v3", "0.3"},
            {"v2", "v3", "1.1"},
            {"v2", "v4", "0.2"},
            {"v2", "v5", "0.1"},
            {"v3", "v4", "0.6"},
            {"v3", "v7", "1.5"},
            {"v3", "v8", "0.8"},
            {"v4", "v5", "0.2"},
            {"v4", "v6", "0.7"},
            {"v4", "v7", "1.2"},
            {"v5", "v6", "0.5"},
            {"v6", "v7", "1.7"},
            {"v6", "v9", "0.4"},
            {"v7", "v8", "1.6"},
            {"v7", "v9", "1.0"},
            {"v8", "v9", "1.4"}
    };

    public int getVerticesAmount() {
        return thirdGraphVerticesAmount;
    }

    public String[][] getGraphData() {
        return thirdGraph;
    }
}
