class WinnerTree{
    int[] tree;
    int[] players;
    int n;

    WinnerTree(int[] players){
        this.players = players;
        this.n = players.length;
        tree = new int[2*n];
        buildTree();
    }

    public void buildTree(){
        for(int i=0;i<n;i++){
            tree[n+i] = players[i];
        }
        for(int i=n-1;i>0;i--){
            tree[i] = Math.min(tree[2*i],tree[2*i+1]);
        }
    }

    public void print(){
        for(int i=1;i<2*n;i++){
            System.out.print(tree[i] + " ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] players = {5,2,8,6};
        WinnerTree wt = new WinnerTree(players);
        wt.print();
    }
}