// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int Eulers(int n){
        int result = n;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                result-=result/i;
            }
        }
        if(n>1){
            result-=result/n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Eulers(n));
    }
}