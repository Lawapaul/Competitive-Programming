// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean isSafe(int[][] maze,int row,int col,int n,int m,int[][] sol){
        if(((row >= 0 && row < n) && (col>=0 && col < m)) && (maze[row][col] == 0 && sol[row][col]==0)) return true;
        return false;
    }
    public static boolean Rat(int[][] maze,int row,int col,int n,int m,int[][] sol){
        if(row==n-1 && col == m-1){
            sol[row][col] = 1;
            return true;
        }
        if(row >= n || col >= m || row <0 || col <0) return false;
        if(isSafe(maze,row,col,n,m,sol)){
            sol[row][col] = 1;
            if(Rat(maze,row+1,col,n,m,sol) ||
               Rat(maze,row-1,col,n,m,sol) ||
               Rat(maze,row,col+1,n,m,sol) ||
               Rat(maze,row,col-1,n,m,sol)
            )  return true;
            sol[row][col] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j] = sc.nextInt();
            }
        }
        int sol[][] = new int[n][m];
        if(Rat(maze,0,0,n,m,sol)){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(sol[i][j]);
                }
                System.out.println();
            }
            return;
        }else{
            System.out.println("No Solution");
        }
    }
}