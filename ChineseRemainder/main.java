import java.util.*;
class Main{
    public static int crt(int[] rem,int[] mod,int n,int p){
        int x=0;
        for(int i=0;i<n;i++){
            int M = p/mod[i];
            int y=0;
            for(int j=1;j<mod[i];j++){
                if((M*j) % mod[i]==1){
                    y=j;
                    break;
                }
            }
            x+=rem[i]*M*y;
        }
        return x%p;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] rem = new int[n];
        int[] mod = new int[n];
        int p=1;
        for(int i=0;i<n;i++){
            rem[i] = sc.nextInt();
            mod[i] = sc.nextInt();
            p=p*mod[i];
        }
        System.out.println(crt(rem,mod,n,p));
    }
}