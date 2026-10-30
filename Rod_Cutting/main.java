import java.util.*;
class Main{
    public static int rodCutting(int[][] dp,int[] price,int[] len,int n,int rodLength){
        if(n==0 || rodLength==0) return 0;
        if(dp[n][rodLength]!=-1) return dp[n][rodLength];
        if(len[n-1] > rodLength) return rodCutting(dp,price,len,n-1,rodLength);
        return dp[n][rodLength] = Math.max(price[n-1] + rodCutting(dp,price,len,n,rodLength-len[n-1]),rodCutting(dp,price,len,n-1,rodLength));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] len = new int[n];
        for(int i=0;i<n;i++){
            len[i] = sc.nextInt();
        }
        int[] price = new int[n];
        for(int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }
        int rodLength = sc.nextInt();
        int[][] dp = new int[n+1][rodLength+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(rodCutting(dp,price,len,n,rodLength));
        
    }
}