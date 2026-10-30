import java.util.*;
class Main{
    public static void bfs(ArrayList<Edge> edges,int nodes,int src){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[nodes];
        Arrays.fill(visited,false);
        q.offer(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for(Edge e: edges){
                if(e.u == u){
                    if(!visited[e.v]){
                        visited[e.v] = true;
                        q.offer(e.v);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int data = sc.nextInt();
                if(data!=0) edges.add(new Edge(i,j,data));
            }
        }
        bfs(edges,n,0);
        
    }
}
class Edge{
    int u;
    int v;
    int w;
    Edge(int u,int v,int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }
}