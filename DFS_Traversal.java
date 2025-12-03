import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter vertices:");
        int vertices = sc.nextInt();
        System.out.println("enter edges:");
        int edges = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
     
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        System.out.println("startvertex:");
        int startVertex = sc.nextInt();
        sc.close();
        boolean[] visited = new boolean[vertices];

        System.out.println("Dfs traversal");
        dfsTraversal(graph, visited, startVertex);
    }
    public static void dfsTraversal(List<List<Integer>> graph, boolean[] visited, int vertex) {
        visited[vertex] = true;
        System.out.println(vertex);

        for (int neighbour : graph.get(vertex)) {
            if (!visited[neighbour]) {
                dfsTraversal(graph, visited, neighbour);
            }
        }
    }
}