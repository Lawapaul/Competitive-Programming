// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] array=new boolean[n];
        for(int i=0;i<n;i++){
            array[i]=true;
        }
        int count=1;
        for(int i=2;i<n;i++){
            for(int j=i*i;j<n;j=j+i){
                array[j]=false;
            }
        }
        int prev=2;
        for(int i=3;i<n;i++){
            if(array[i]==true){
                if(i-prev == 2){
                    System.out.printf("(%d,%d)\n",prev,i);
                }
                prev=i;
            }
        }
    }
}