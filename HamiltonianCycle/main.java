import java.util.*;
class Main{
    static int[][] graph;
    static int n;
    static boolean[] visited;
    static List<Integer> path = new ArrayList<Integer>();
    public static boolean dfs(int count,int u,int start){
        if(n==count){
            return graph[u][start]==1;
        }
        for(int i=0;i<n;i++){
            if(!visited[i] && graph[u][i]==1){
                visited[i]=true;
                path.add(i);
                if(dfs(count+1,i,start)) return true;
                visited[i] = false;
                path.remove(path.size()-1);
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j] = sc.nextInt();
            }
        }
        visited = new boolean[n];
        visited[0]=true;
        path.add(0);
        if(dfs(1,0,0)){
            for(int k: path){
                System.out.print(k + "-");
            }
            System.out.print(0);
        }else{
            System.out.print("No Cycle");
        }
    }
}