import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]){
                    left[i] = Math.max(left[i],left[j]+1);
                }
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(arr[i] > arr[j]){
                    right[i] = Math.max(right[i],right[j]+1);
                }
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,left[i] + right[i] - 1);
        }
    }
}