import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        String result = "";
        for(String s : arr) {
            result += s;
        }
        if(result.charAt(0) == '0') {
            result = "0";
        }
        System.out.println(result);
    }
}