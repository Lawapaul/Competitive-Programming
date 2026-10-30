import java.util.*;
class Main{
    public static void helper(int[] arr,int n,int r,int index,int i,int[] data){
        if(index==r){
            for(int j=0;j<r;j++){
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }
        if(i>=n) return;
        data[index]=arr[i];
        helper(arr,n,r,index+1,i+1,data);
        helper(arr,n,r,index,i+1,data);
    }
    public static void combination(int[] arr,int n,int r){
        int[] data = new int[r];
        helper(arr,n,r,0,0,data);
        return;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        combination(arr,n,r);
    }
}