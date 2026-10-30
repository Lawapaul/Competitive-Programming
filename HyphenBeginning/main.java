
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> ls = new ArrayList<Character> ();
        int hyphenCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                hyphenCount++;
            }else{
                ls.add(s.charAt(i));
            }
        }
        char[] arr = new char[s.length()];
        for(int i=0;i<hyphenCount;i++){
            arr[i] = '-';
        }
        int j=hyphenCount;
        for(char val: ls){
            arr[j]=val;
            j++;
        }
        s = new String(arr);
        System.out.println(s);
    }
}