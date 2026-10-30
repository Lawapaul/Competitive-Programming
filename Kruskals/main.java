// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Edge{
    public int s,d,w;
    Edge(int s,int d,int w){
        this.s=s;
        this.d=d;
        this.w=w;
    }
};
class Disjoint{
    int[] parent;
    int[] rank;
    int v;
    Disjoint(int v){
        this.v=v;
        parent = new int[v];
        rank = new int[v];
        for(int i=0;i<v;i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }
    int find(int x){
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    void union(int x,int y){
        int px = find(x);
        int py = find(y);
        if(px==py) return;
        if(rank[px] > rank[py]){
            parent[py] = px;
            return;
        }else if(rank[py] > rank[px]){
            parent[px] = py;
            return;
        }else{
            parent[py] = px;
            rank[px]++;
        }
    }
};
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        Edge[] edges = new Edge[e];
        for(int i=0;i<e;i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            edges[i] = new Edge(s,d,w);
        }
        Arrays.sort(edges,new Comparator<Edge>(){
            public int compare(Edge a,Edge b){
                return a.w - b.w;
            }
        });
        Disjoint ds = new Disjoint(v);
        List<Edge> mst = new ArrayList<Edge> ();
        int sum=0;
        for(Edge E: edges){
            int p1 = ds.find(E.s);
            int p2 = ds.find(E.d);
            if(p1!=p2){
                mst.add(E);
                sum+=E.w;
                ds.union(E.s,E.d);
            }
        }
        System.out.println(sum);
    }
}