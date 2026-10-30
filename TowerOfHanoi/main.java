import java.util.*;

class Main{
    public static void toh(int n,char src,char helper,char dest){
        if(n==1){
            System.out.println("Disk " + n + " moved from " + src + "  to " + dest);
            return;
        }
        toh(n-1,src,dest,helper);
        System.out.println("Disk " + n + " moved from " + src + "  to " + dest);
        toh(n-1,helper,src,dest);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,'A','B','C');
    }
}