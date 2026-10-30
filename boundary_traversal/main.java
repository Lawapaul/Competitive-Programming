import java.util.*;
class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
    }
};
class Main {
    public static Node buildTree(int[] arr,int i){
        if(i >= arr.length) return null;
        Node root = new Node(arr[i]);
        root.left = buildTree(arr,2*i+1);
        root.right = buildTree(arr,2*i+2);
        return root;
    }
    public static boolean isLeaf(Node node){
        return (node.left==null && node.right==null);
    }
    public static void leftBoundary(Node node){
        Node curr = node.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                System.out.print(curr.data + " ");
            }
            if(curr.left!=null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
    }
    public static void leaf(Node root){
        if(root==null) return;
        if(isLeaf(root)) System.out.print(root.data + " ");
        leaf(root.left);
        leaf(root.right);
    }
    public static void rightBoundary(Node node){
        Node curr = node.right;
        Stack<Integer> st = new Stack<>();
        while(curr!=null){
            if(!isLeaf(curr)){
                st.push(curr.data);
            }
            if(curr.right!=null){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
    public static void boundary(Node root){
        System.out.print(root.data + " ");
        leftBoundary(root);
        leaf(root);
        rightBoundary(root);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(arr,0);
        boundary(root);
        
    }
}