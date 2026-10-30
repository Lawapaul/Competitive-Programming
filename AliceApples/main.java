import java.util.*;
class Main{
    public static int apple(int M,int k,int S,int E,int W,int N){
        if(S*k >=M) return M;
        else if(M <= S*k + E + W) return S*k + (M-S*k);
        else return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int k = sc.nextInt();
        int S = sc.nextInt();
        int E = sc.nextInt();
        int N = sc.nextInt();
        int W = sc.nextInt();
        System.out.println(apple(M,k,S,E,W,N));
    }
}