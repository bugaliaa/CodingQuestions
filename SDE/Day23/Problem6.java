package SDE.Day23;

// https://leetcode.com/problems/number-of-islands/
// Number of islands (graph) (LeetCode)

public class Problem6 {
    class DisjointSets{
        int[] parent, rank;
        int n;
        public DisjointSets(int n){
            this.n = n;
            parent = new int[n];
            rank = new int[n];
        }
        public void makeSet(){
            for(int i = 0; i < n; i++) parent[i] = i;
        }
        public int findParent(int node){
            if(node == parent[node]) return node;
            return parent[node] = findParent(parent[node]);
        }
        public void union(int u, int v){
            u = findParent(u);
            v = findParent(v);

            if(rank[u] < rank[v]){
                parent[u] = v;
            }else if(rank[v] < rank[u]){
                parent[v] = u;
            }else{
                parent[v] = u;
                rank[u]++;
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        DisjointSets ds = new DisjointSets(n*m);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '0') continue;

                if(i-1 >= 0 && grid[i-1][j] == '1') ds.union(i*(m) + j, (i-1)*(m) + j);
                if(i+1 < n && grid[i+1][j] == '1') ds.union(i*(m) + j, (i+1)*(m) + j);
                if(j-1 >= 0 && grid[i][j-1] == '1') ds.union(i*(m) + j, (i)*(m) + (j-1));
                if(j+1 < m && grid[i][j+1] == '1') ds.union(i*(m) + j, (i)*(m) + (j+1));
                // if(j+1 < m && i-1 >= 0 && grid[i-1][j+1] == '1') ds.union(i*(m) + j, (i-1)*(m) + (j+1));
                // if(j+1 < m && i+1 < n && grid[i+1][j+1] == '1') ds.union(i*(m) + j, (i+1)*(m) + (j+1));
                // if(j-1 >= 0 && i-1 >= 0 && grid[i-1][j-1] == '1') ds.union(i*(m) + j, (i-1)*(m) + (j-1));
                // if(j-1 >= 0 && i+1 < n && grid[i+1][j-1] == '1') ds.union(i*(m) + j, (i+1)*(m) + (j-1));
            }
        }

        int c[] = new int[n*m];
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    int x = ds.findParent(i*(m)+j);
                    if(c[x] == 0){
                        count++;
                        c[x]++;
                    }else c[x]++;
                } 
            }
        }
        return count;
    }
}
