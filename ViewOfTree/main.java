import java.util.*;

class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data = data;
    }
}

class Main {

    public static Node buildTree(int[] arr,int i){

        if(i>=arr.length) return null;
        Node root = new Node(arr[i]);
        root.left = buildTree(arr,2*i+1);
        root.right = buildTree(arr,2*i+2);

        return root;
    }

    public static void left(Node root){

        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();

            for(int i=0;i<size;i++){

                Node curr = q.poll();

                if(i==0){
                    System.out.print(curr.data+" ");
                }

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
    }

    public static void right(Node root){

        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();

            for(int i=0;i<size;i++){

                Node curr = q.poll();

                if(i==size-1){
                    System.out.print(curr.data+" ");
                }

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7};

        Node root = buildTree(arr,0);

        System.out.print("Left View: ");
        left(root);

        System.out.println();

        System.out.print("Right View: ");
        right(root);
    }
}