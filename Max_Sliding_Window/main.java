// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<>();
        int k = sc.nextInt();
        for(int i=0;i<=n-k;i++){
            int Max = Integer.MIN_VALUE;
            for(int j=0;j<i+k;j++){
                Max = Math.max(Max,arr[j]);
            }
            a.add(Max);
        }
        for(int x: a) System.out.println(x);
    }
}