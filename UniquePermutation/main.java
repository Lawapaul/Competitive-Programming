// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void permutation(String s,HashSet<String> set,int idx){
        if(idx==s.length()){
            set.add(s);
            return;
        }
        for(int i=0;i<s.length();i++){
            char[] arr = s.toCharArray();
            char temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            s = new String(arr);
            permutation(s,set,idx+1);
            arr = s.toCharArray();
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet <String> set = new HashSet<String>();
        permutation(s,set,0);
        List<String> S = new ArrayList<> (set);
        Collections.sort(S);
        System.out.print(S);
    }
}