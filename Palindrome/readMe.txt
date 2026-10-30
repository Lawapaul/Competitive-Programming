// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static String palindrome(String s){
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int oddCount=0;
        int oddChar=-1;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                oddCount++;
                oddChar=i;
            }
        }
        if(s.length()%2==0 && oddCount > 0 || s.length()%2!=0 && oddCount!=1){
            return "Cannot Form";
        }
        String front ="";
        String rear = "";
        for(int i=0;i<26;i++){
            int half = freq[i]/2;
            char ch = (char)(i + 'a');
            for(int j=0;j<half;j++){
                front+=ch;
                rear = ch + rear;
            }
        }
        String middle = (oddChar!=-1)  ? Character.toString((char)(oddChar + 'a')) : "";
        return front + middle + rear;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(palindrome(s));
        
    }
}