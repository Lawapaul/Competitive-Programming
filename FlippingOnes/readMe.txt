// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static int flipping(int[] arr,int k){
        int i=0;
        int zeroCount=0;
        int maxOnes = Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(arr[i]==0){
                    zeroCount--;
                }
                i++;
            }
            maxOnes = Math.max(maxOnes,j-i+1);
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        String result = Integer.toBinaryString(number);
        int size = result.length();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = result.charAt(i) - '0';
        }
        int k = sc.nextInt();
        System.out.println(flipping(array,k));
    }
}