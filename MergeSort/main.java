import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            a.add(data);
        }
        Collections.sort(a,Collections.reverseOrder());
        for(int data: a){
            System.out.println(data);
        }
    }
}

