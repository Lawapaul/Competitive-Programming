import java.util.*;
class Main{
    public static boolean helper(String s){
        HashMap <Character,Character> map = new HashMap<Character,Character> ();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('9','6');
        map.put('8','8');
        int st = 0;
        int e = s.length()-1;
        while(st <=e){
            char left = s.charAt(st);
            char right = s.charAt(e);
            char mapping = map.getOrDefault(left,'-');
            if(mapping=='-') return false;
            if(mapping != right) return false;
            st++;
            e--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s =  Integer.toString(n);
        if(helper(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}