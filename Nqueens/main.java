import java.util.*;
class Main{
    public static void Sol(char[][] board,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<col;i++){
            if(board[row][i]=='Q') return false;
        }
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public static void nQueens(char[][] board,int row,int n){
        if(row==n){
            Sol(board,n);
            return;
        }
        for(int col = 0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                nQueens(board,row+1,n);
                board[row][col] = '-';
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '-';
            }
        }
        nQueens(board,0,n);
    }
}