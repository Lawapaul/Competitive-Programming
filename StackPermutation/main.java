import java.util.*;
class Main{
    public static boolean isPermutation(int[] original,int[] target){
        Stack<Integer> s = new Stack<>();
        int i=0;
        for(int data: original){
            s.push(data);
            while(!s.isEmpty() && i <target.length && s.peek() == target[i]){
                s.pop();
                i++;
            }
        }
        return s.isEmpty() && i == target.length;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] original = new int[n];
        int[] current = new int[n];
        for(int i=0;i<n;i++) original[i] = sc.nextInt();
        for(int i=0;i<n;i++) current[i] = sc.nextInt();
        if(isPermutation(original,current)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }
}