import java.util.*;

class Main{
    public static void insertAtBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int element = st.peek();
        st.pop();
        insertAtBottom(st,data);
        st.push(element);
    }
    public static int getMin(Stack<Integer> st){
        if(st.size()==1) return st.peek();
        int data = st.peek();
        st.pop();
        int min = getMin(st);
        insertAtBottom(st,data);
        return Math.min(data,min);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            st.push(data);
        }
        System.out.println(getMin(st));
        
        
    }
}

