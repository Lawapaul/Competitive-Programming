import java.util.*;

class Main {

    public static int helper(int[] coins,
                             int amount,
                             int[] dp) {
        if(amount == 0)
            return 0;
        if(amount < 0)
            return Integer.MAX_VALUE;
        if(dp[amount] != -1)
            return dp[amount];
        int mini = Integer.MAX_VALUE;
        for(int coin : coins) {
            int ans = helper(coins,
                             amount - coin,
                             dp);
            if(ans != Integer.MAX_VALUE) {
                mini = Math.min(mini,
                                1 + ans);
            }
        }
        return dp[amount] = mini;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] coins = new int[n];

        for(int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int amount = sc.nextInt();

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, -1);

        int ans = helper(coins,
                         amount,
                         dp);

        if(ans == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans);
    }
}