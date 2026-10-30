// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int row = sc.nextInt();
       int col = sc.nextInt();
       int[][] matrix = new int[row][col];
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               matrix[i][j] = sc.nextInt();
           }
       }
       if(row < 3 || col < 3){
           System.out.println("Not Possible");
           return;
       }
       int sum =0;
       for(int i=0;i<row-2;i++){
           for(int j=0;j<col-2;j++){
               int Sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j+1] + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
               sum = Math.max(sum,Sum);
           }
       }
       System.out.println(sum);
    }
}