import java.util.*;

class Main{
    public static boolean helper(String word,String pattern){
        int n =word.length();
        int m = pattern.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int j=1;j<=m;j++){
            if(pattern.charAt(j-1)=='*'){
                dp[0][j] = dp[0][j-1];
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(pattern.charAt(j-1)=='*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else if(pattern.charAt(j-1)=='?' || word.charAt(i-1) == pattern.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word,pattern;
        word = sc.next();
        pattern = sc.next();
        if(helper(word,pattern)){
            System.out.println("Match");
        }else{
            System.out.println("Not Matched");
        }
    }
}