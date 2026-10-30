import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] relation = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                relation[i][j] = sc.nextInt();
            }
        }
        int c=0;
        for(int i=1;i<n;i++){
            if(relation[c][i] == 1){
                c = i;
            }
        }
        //verify
        for(int i=0;i<n;i++){
            if(i!=c && (relation[i][c]==0 || relation[c][i]==1)){
                System.out.println("No Candidate");
                return;
            }
        }
        System.out.println(c);
    }
}