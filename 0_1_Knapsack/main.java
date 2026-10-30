import java.util.*;
class Main{
    public static int helper(int W,int[] wt,int[] val,int n){
        if(n==0 || W==0) return 0;
        if(wt[n-1] > W) return helper(W,wt,val,n-1);
        return Math.max(wt[n-1] + helper(W-wt[n-1],wt,val,n-1),helper(W,wt,val,n-1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for(int i=0;i<n;i++){
            wt[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            val[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        System.out.println(helper(W,wt,val,n));
    }
}