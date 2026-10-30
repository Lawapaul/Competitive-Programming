import java.util.*;
class Main{
    static int n=8;
    static int[][] board = new int[n][n];
    static int[] dx = {2,1,-1,-2,-2,-1,1,2};
    static int[] dy = {1,2,2,1,-1,-2,-2,1};
    static boolean valid(int x,int y){
        return (x>=0 && x<n && y>=0 && y<n && board[x][y]==0);
    }
    static int degree(int x,int y){
        int count=0;
        for(int i=0;i<8;i++){
            if(valid(x+dx[i],y+dy[i])) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;
        board[x][y]=1;
        for(int step=2;step<=n*n;i++){
            int bestX=-1;
            int bestY=-1;
            int bestDegree=9;
            for(int i=0;i<8;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(valid(nx,ny)){
                    int deg = degree(nx,ny);
                    if(deg < bestDegree){
                        bestDegree=deg;
                        bestX=nx;
                        bestY=ny;
                    }
                }
            }
            if(bestX==-1){
                System.out.println("Cant move");
                return;
            }
            x=bestX;
            y=bestY;
            board[x][y] = step;
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}