import java.util.*;

class KaryHeap {

    int[] heap;
    int size;
    int k;

    KaryHeap(int capacity, int k){
        heap = new int[capacity];
        size = 0;
        this.k = k;
    }
    int parent(int i){
        return (i-1)/k;
    }
    int child(int i, int j){
        return k*i + j;
    }
    void insert(int val){
        heap[size] = val;
        int i = size;
        size++;

        while(i>0 && heap[parent(i)] < heap[i]){

            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;

            i = parent(i);
        }
    }

    int extractMax(){

        int max = heap[0];
        heap[0] = heap[size-1];
        size--;

        heapify(0);

        return max;
    }

    void heapify(int i){

        int largest = i;

        for(int j=1;j<=k;j++){

            int child = child(i,j);

            if(child < size && heap[child] > heap[largest]){
                largest = child;
            }
        }

        if(largest != i){

            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            heapify(largest);
        }
    }

    void print(){
        for(int i=0;i<size;i++)
            System.out.print(heap[i]+" ");
    }
}

class Main{
    public static void main(String[] args){

        KaryHeap h = new KaryHeap(20,3); 

        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(30);
        h.insert(40);

        h.print();
    }
}