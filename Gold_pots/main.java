import java.util.*;
class Main{
    public static int helper(int[] arr,int i,int j){
        if(i==j) return arr[i];
        if(i+1==j) return Math.max(arr[i],arr[j]);
        int s = arr[i] + Math.max(helper(arr,i+2,j),helper(arr,i+1,j-1));
        int e = arr[j] + Math.max(helper(arr,i+1,j-1),helper(arr,i,j-2));
        return Math.max(s,e);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(helper(arr,0,n-1));
    }
}