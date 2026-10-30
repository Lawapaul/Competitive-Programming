import java.util.*;
class Edge{
    int s,d,w;
    Edge(int s,int d,int w){
        this.s = s;
        this.d = d;
        this.w = w;
    }
};
class Main{
    public static void bf(ArrayList<Edge> edges,int src,int v){
        int[] dist = new int[v];
        for(int i=0;i<v;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        for(int i=1;i<v;i++){
            for(Edge e: edges){
                int u = e.s;
                int des = e.d;
                int w = e.w;
                if(dist[u]!=Integer.MAX_VALUE && dist[u] + w < dist[des]){
                    dist[des] = dist[u] + w;
                }
            }
        }
        for(Edge e: edges){
                int u = e.s;
                int des = e.d;
                int w = e.w;
                if(dist[u]!=Integer.MAX_VALUE && dist[u] + w < dist[des]){
                    System.out.println("Negative Cycle");
                    return;
                }
        }
        for(int i=0;i<v;i++) System.out.print(dist[i] + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Edge> edges = new ArrayList<>();
        int v = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            edges.add(new Edge(s,d,w));
        }
        bf(edges,0,v);
    }
}