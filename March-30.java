import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphsQueues {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        if (graph == null || graph.length == 0) {
            return;
        }

        boolean[] vis = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();

        // Handle disconnected graphs by starting BFS from every unvisited node.
        for (int start = 0; start < graph.length; start++) {
            if (vis[start]) {
                continue;
            }

            q.add(start);

            while (!q.isEmpty()) {
                int curr = q.remove();
                if (vis[curr]) {
                    continue;
                }

                System.out.println(curr);
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!vis[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        if (graph == null || vis == null || curr < 0 || curr >= graph.length) {
            return;
        }

        vis[curr] = true;
        System.out.println(curr);

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }
}



















