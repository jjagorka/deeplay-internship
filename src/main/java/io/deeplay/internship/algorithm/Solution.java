package io.deeplay.internship.algorithm;

import io.deeplay.internship.IOUtiils.ObstaclesStringToArray;

import java.io.IOException;
import java.util.List;

public class Solution {
    public static int getResult(String inputObstacles, String inputCreature) throws IOException {
        return getResult(inputObstacles, inputCreature, "src/main/resources/information.json");
    }

    public static int getResult(String inputObstacles, String inputCreature, String path) throws IOException {
        List<Integer> listObstacles = ObstaclesStringToArray.listObstacles(inputObstacles, inputCreature, path);

        int sqrt = (int) Math.sqrt(listObstacles.size());
        Graph graph = new Graph(listObstacles.size());

        for (int i = 0; i < listObstacles.size() - 1; i++) {
            if (i + sqrt < listObstacles.size()) {
                graph.addEdge(i, i + sqrt, listObstacles.get(i + sqrt));
                graph.addEdge(i + sqrt, i, listObstacles.get(i));
            }
            if ((i + 1) % sqrt > 0) {
                graph.addEdge(i, i + 1, listObstacles.get(i + 1));
                graph.addEdge(i + 1, i, listObstacles.get(i));
            }
        }
        graph.path();

        return graph.getShortestPaths().get(listObstacles.size() - 1);
    }
}