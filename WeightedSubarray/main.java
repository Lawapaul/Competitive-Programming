import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet <String> map = new HashSet <String> ();
        String s = sc.next();
        int k = sc.nextInt();
        for(int i=0;i<s.length();i++){
            String sub="";
            int sum=0;
            for(int j=i;j<s.length();j++){
                sum+=(s.charAt(j) - 'a');
                sub+=s.charAt(j);
                if(sum==k){
                    map.add(sub);
                }else if(sum>k){
                    break;
                }
            }
        }
        System.out.println(map.size());
    }
}