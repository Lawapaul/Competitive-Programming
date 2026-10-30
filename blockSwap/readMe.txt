// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static void swap(int[] arr,int ptr,int ptr_e){
        while(ptr < ptr_e){
            int temp=arr[ptr];
            arr[ptr] = arr[ptr_e];
            arr[ptr_e]=temp;
            ptr++;
            ptr_e--;
        }
    }
    static void rotation(int[] arr,int k){
        int n = arr.length;
        k=k%n;
        if(k==0)return;
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        swap(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        rotation(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}