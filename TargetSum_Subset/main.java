import java.util.*;
class Main{
    public static boolean subsetSum(int target,int[] arr,int n){
        if(target == 0) return true;
        if(n < 0) return false;
        return subsetSum(target - arr[n],arr,n-1) || subsetSum(target,arr,n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        if(subsetSum(target,arr,n-1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}