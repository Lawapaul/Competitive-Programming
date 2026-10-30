// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[size];
        prefix[0] = arr[0];
        int maxSum = Integer.MIN_VALUE;
        for(int i=1;i<size;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int[] suffix = new int[size];
        suffix[size-1] = arr[size-1];
        for(int i=size-2;i>=0;i--){
            suffix[i] = suffix[i+1] + arr[i];
        }
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(prefix[i]==suffix[i]){
                Max=Math.max(Max,prefix[i]);
            }
        }
        System.out.println(Max);
    }
}