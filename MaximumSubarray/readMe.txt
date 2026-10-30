// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int MaxNum = Integer.MIN_VALUE;
        int product=1;
        int size = sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            product*=arr[i];
            MaxNum = Math.max(MaxNum,product);
            if(product==0){
                product=1;
            }
        }
        product=1;
        for(int i=size-1;i>=0;i--){
            product*=arr[i];
            MaxNum = Math.max(MaxNum,product);
            if(product==0){
                product=1;
            }
        }
        System.out.println(MaxNum);
    }
}