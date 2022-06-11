package io.deeplay.internship.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    final int countOfVertices;
    private final int[][] relationMatrix;
    private final List<Integer> shortestPaths;
    private final List<Integer> notUsedVertex;
    private static final int INFINITY = 999999999;

    public Graph(int countOfVertices) {
        this.countOfVertices = countOfVertices;
        relationMatrix = new int[countOfVertices][countOfVertices];
        shortestPaths = new ArrayList<>(countOfVertices);
        notUsedVertex = new ArrayList<>();

        for (int i = 0; i < countOfVertices; i++) {
            notUsedVertex.add(i);
            for (int j = 0; j < countOfVertices; j++) {
                relationMatrix[i][j] = INFINITY;
            }
        }
    }

    public void addEdge(int start, int end, int weight) {
        relationMatrix[start][end] = weight;
    }

    private void remove(final Integer value) {
        notUsedVertex.remove(value);
    }

    public List<Integer> getShortestPaths() {
        return shortestPaths;
    }

    public void path() {

        remove(0);
        shortestPaths.add(0, INFINITY);

        for (int i = 1; i < countOfVertices; i++) {
            shortestPaths.add(i, relationMatrix[0][i]);
        }

        for (int i = 1; i < countOfVertices - 1; i++) {
            int min = INFINITY;
            int minIndex = 0;

            for (final int j : notUsedVertex) {
                if (shortestPaths.get(j) < min) {
                    min = shortestPaths.get(j);
                    minIndex = j;
                }
            }
            remove(minIndex);

            for (final int v : notUsedVertex) {
                shortestPaths.set(v, Math.min(shortestPaths.get(v), shortestPaths.get(minIndex) + relationMatrix[minIndex][v]));

            }
        }
    }
}
