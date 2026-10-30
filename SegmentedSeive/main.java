import java.util.*;
class Main {
    static ArrayList<Integer> Primenumbers = new ArrayList<>();
    public static void primeNumbers(int low,int max){
        int root =(int) Math.sqrt(max);
        boolean[] array=new boolean[root+1];
        for(int i=2;i<=root;i++){
            array[i]=true;
        }
        for(int i=2;i*i<=root;i++){
            for(int j=i*i;j<=root;j=j+i){
                array[j]=false;
            }
        }
        for(int i=2;i<=root;i++){
            if(array[i]==true){
                Primenumbers.add(i);
            }
        }
        int size = max - low +1;
        boolean isPrime[] = new boolean[size];
        for(int i=0;i<size;i++){
            isPrime[i]=true;
        }
        for(int k: Primenumbers){
            int firstMultiple = (low/k)*k;
            if(firstMultiple <low){
                firstMultiple+=k;
            }
            int s=Math.max(firstMultiple,k*k);
            for(int i=s;i<=max;i+=k){
                isPrime[i-low]=false;
            }
        }
        for(int i=low;i<=max;i++){
            if(isPrime[i-low]==true && i>1){
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) {
        primeNumbers(0,100);
    }
}