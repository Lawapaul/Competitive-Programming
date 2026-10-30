import java.util.*;
class Main{
    public static void dfs(int[][] graph,boolean[] visited,int node,Stack<Integer> st){
        visited[node] = true;
        for(int i=0;i<graph.length;i++){
            if(graph[node][i] != 0 && !visited[i]){
                dfs(graph,visited,i,st);
            }
        }
        
        st.push(node);
    }
    public static void ts(int[][] graph,int n){
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(!visited[i]) dfs(graph,visited,i,st);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j] = sc.nextInt();
            }
        }
        ts(graph,n);
    }
}