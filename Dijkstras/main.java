import java.util.*;
class Main{
    public static void dijkstras(ArrayList<Edge> edges,int nodes,int src){
        int[] dist = new int[nodes];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->{
                return a.dist - b.dist;
            }
            );
        pq.offer(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair front = pq.poll();
            int node = front.node;
            for(Edge e: edges){
                if(e.u == node){
                    int v = e.v;
                    int w = e.w;
                    if(dist[node] != Integer.MAX_VALUE && dist[node] + w < dist[v]){
                        dist[v] = dist[node] + w;
                        pq.offer(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for(int x: dist) System.out.print(x + " ");
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
        dijkstras(edges,n,0);
        
    }
}
class Pair{
    int node,dist;
    Pair(int node,int dist){
        this.node = node;
        this.dist = dist;
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