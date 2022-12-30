class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        if (dislikes.length == 0) return true;
        List<Integer> adj[] = new List[N+1];
        int[] color = new int[N+1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < dislikes.length; i++) {
            adj[dislikes[i][0]].add(dislikes[i][1]);
            adj[dislikes[i][1]].add(dislikes[i][0]);
        }
        for (int i = 1; i <= N; i++) {
            if (color[i] == 0 && !bfs(i, adj, color, 1))
                return false;
        }
        
        return true;
    }
    
    private boolean bfs(int i, List<Integer>[] adj, int[] colors, int color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        colors[i] = color;
        
        while(!q.isEmpty()) {
            int v = q.poll();
            for (int u : adj[v]) {
                if (colors[u] == colors[v]) {
                    return false;
                } else if (colors[u] == 0) {
                    colors[u] = -colors[v];
                    q.offer(u);
                }
            }
        }
        
        return true;
    }
}
