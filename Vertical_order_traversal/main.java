import java.util.*;
class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
    }
};
class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node = node;
        this.hd = hd;
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
    public static void verticleOrder(Node root,int hd){
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.poll();
            Node node = front.node;
            int nodeHD = front.hd;
            map.putIfAbsent(nodeHD,new ArrayList<>());
            map.get(nodeHD).add(node.data);
            if(node.left!=null){
                q.add(new Pair(node.left,nodeHD-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,nodeHD+1));
            }
        }
        for(ArrayList<Integer> list: map.values()){
            for(int x: list){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(arr,0);
        verticleOrder(root,0);
        
    }
}