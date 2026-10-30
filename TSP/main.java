import java.util.*;

class Main {

    static int[][] cost;
    static boolean[] visited;
    static int n;
    static int min = Integer.MAX_VALUE;

    static void tsp(int city, int count, int total) {
        if (count == n && cost[city][0] > 0) {
            min = Math.min(min, total + cost[city][0]);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && cost[city][i] > 0) {
                visited[i] = true;
                tsp(i, count + 1, total + cost[city][i]);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cost = new int[n][n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        visited[0] = true;
        tsp(0, 1, 0);
        System.out.println(min);
    }
}