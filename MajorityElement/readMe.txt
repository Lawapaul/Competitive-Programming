// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[] arr=new int[size];
       for(int i=0;i<size;i++){
           arr[i] = sc.nextInt();
       }
       int candidate = arr[0];
       int count=1;
       for(int i=1;i<arr.length;i++){
           if(count==0){
               candidate = arr[i];
               count=1;
           }else if(candidate==arr[i]){
               count++;
           }else{
               count--;
           }
       }
       count = 0;
       for(int i = 0; i < arr.length; i++){
            if(arr[i] == candidate){
                count++;
            }
        }
       if(count > arr.length/2){
           System.out.println(candidate);
       }else{
           System.out.println(-1);
       }
    }
}