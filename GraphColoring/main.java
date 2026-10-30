import java.util.*;
class Main{
    public static boolean isSafe(int n,int v,int[] color,int c,int[][] graph){
        for(int i=0;i<n;i++){
            if(graph[v][i]==1 && color[i]==c) return false;    
        }
        return true;
    }
    public static boolean coloring(int n,int v,int[] color,int m,int[][] graph){
        if(n==v) return true;
        for(int i=1;i<=m;i++){
            if(isSafe(n,v,color,i,graph)){
                color[v] = i;
                if(coloring(n,v+1,color,m,graph)) return true;
                color[v] = 0;
            }
        }
        return false;
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
        int m=sc.nextInt();
        int[] color = new int[n];
        if(coloring(n,0,color,m,graph)){
            System.out.print("yes");
        }else{
            System.out.print("No");
        }
    }
}