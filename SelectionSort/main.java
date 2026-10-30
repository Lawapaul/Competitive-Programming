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
        System.out.println("Before:\n");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        //SelectionSort
        for(int i=0;i<n;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.print("After\n");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}