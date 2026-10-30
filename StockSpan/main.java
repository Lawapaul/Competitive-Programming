// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++) prices[i] = sc.nextInt();
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && prices[s.peek()] <= prices[i]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = Math.min(i+1,k);
            }else{
                span[i] = Math.min(i-s.peek(),k);
            }
            s.push(i);
        }
        for(int data: span) System.out.println(data);
    }
}