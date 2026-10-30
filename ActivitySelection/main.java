// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] finish = new int[n];
        for(int i=0;i<n;i++){
            start[i] = sc.nextInt();
            finish[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(finish[j+1] < finish[j]){
                    int temp = finish[j+1];
                    finish[j+1] = finish[j];
                    finish[j] = temp;
                    
                    //StartTime
                    temp = start[j+1];
                    start[j+1] = start[j];
                    start[j] = temp;
                }
            }
        }
        List<Integer> ls = new ArrayList<Integer> ();
        int startTime = finish[0];
        ls.add(0);
        for(int i=1;i<n;i++){
            if(start[i] >= startTime){
                startTime = finish[i];
                ls.add(i);
            }
        }
        System.out.println(ls);
    }
}