import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}


class LinkedList{
    Node head;
    Node tail;
    LinkedList(){
        head=tail=null;
    }
    Node reverse(Node head){
        Node prev=null,curr=head,next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    Node merge(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        if(a.data < b.data){
            a.next = merge(a.next,b);
            return a;
        }else{
            b.next = merge(a,b.next);
            return b;
        }
    }
    void compare(){
        if(head==null || head.next==null) return;
        Node curr = head;
        while(curr.next!=null && curr.data < curr.next.data){
            curr=curr.next;
        }
        Node second = curr.next;
        curr.next = null;
        
        second = reverse(second);
        head = merge(head,second);
    }
    void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(2);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(6);
        list.add(4);
        list.add(1);

        list.compare();
        list.display();
    }
}