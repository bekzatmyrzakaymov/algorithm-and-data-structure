package com.company.Graph;

public class Main2 {
    public static void main(String[] args) {

//        WeightedGraph<String> graph = new WeightedGraph<>(true);
        MyGraph<String> graph=new MyGraph<>(true);
        graph.addEdge("Almaty", "Astana");
        graph.addEdge("Almaty", "Shymkent");
        graph.addEdge("Shymkent", "Astana");
        graph.addEdge("Astana", "Kostanay");
        graph.addEdge("Shymkent", "Kyzylorda");

//        System.out.println("Dijkstra:");
//        Search<String> djk = new DijkstraSearch<>(graph, "Almaty");
//        outputPath(djk, "Kyzylorda");

        System.out.println("DFS:");
        Search<String> dfs = new DepthFirstSearch<>(graph, "Almaty");
        outputPath(dfs, "Kyzylorda");

        System.out.println("\n--------------------------------");

        System.out.println("BFS:");
        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
        outputPath(bfs, "Kyzylorda");
    }

    public static void outputPath(Search<String> search, String key) {
        for (String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }
    }
}
