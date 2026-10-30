import java.util.*;


public class Main{
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        for(int i=0;i<8;i++){
            ll.push(i);
        }
        ll.display(ll.evenOdd());
    }
}

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    LinkedList(){
        head=tail=null;
    }
    void push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next = newNode;
            tail=newNode;
        }
    }
    Node evenOdd(){
        Node evenHead=null;
        Node evenTail=null;
        Node oddHead=null;
        Node oddTail=null;
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.data);
            if(temp.data%2==0){
                if(evenHead==null){
                    evenHead=evenTail=newNode;
                }else{
                    evenTail.next = newNode;
                    evenTail = newNode;
                }
            }else{
                if(oddHead==null){
                    oddHead=oddTail=newNode;
                }else{
                    oddTail.next = newNode;
                    oddTail = newNode;
                }
            }
            temp=temp.next;
        }
        if(evenTail != null){
            if(oddHead!=null){
                evenTail.next = oddHead;
            }
            return evenHead;
        }
        if(oddHead!=null) return oddHead;
        return null;
    }
    void display(Node ptr){
        Node temp = ptr;
        while(temp!=null){
            if(temp.next==null) System.out.print(temp.data);
            else System.out.print(temp.data + "->");
            temp=temp.next;
        }
    }
}
