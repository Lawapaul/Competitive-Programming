// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int rightMax = arr[arr.length-1];
        System.out.print(rightMax + " ");
        for(int i=n-2;i>=0;i--){
            if(arr[i] > rightMax){
                System.out.print(arr[i] + " ");
                rightMax=arr[i];
            }
        }
    }
}