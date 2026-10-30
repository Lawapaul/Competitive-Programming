// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dp = new int[n];
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                dp[j]+=dp[j-1];
            }
        }
        System.out.println(dp[n-1]);
    }
}