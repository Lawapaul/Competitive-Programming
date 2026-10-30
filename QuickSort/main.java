// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int Partition(int[] arr,int st,int end){
        int pivot = arr[end];
        int i=st-1;
        for(int j=st;j<end;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }
    public static void quickSort(int[] arr,int st,int end){
        if(st>=end) return;
        int partition = Partition(arr,st,end);
        quickSort(arr,st,partition-1);
        quickSort(arr,partition+1,end);
    }
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
        //QuickSort
        quickSort(arr,0,n-1);
        System.out.print("After\n");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}