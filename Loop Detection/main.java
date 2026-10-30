// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    Node next;
    int data;
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
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next = newNode;
            tail=newNode;
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
    }
    void cycle(){
        Node slow = head;
        Node fast = head;
        boolean flag=false;
        while(slow!= null && fast!=null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                flag=true;
                break;
               
            }
        }
        if(!flag) System.out.println("Cycle Not Found");
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.printf("Cycle found at %d",slow.data);
        
    }
}
class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.head.next.next.next = ll.head;
        ll.cycle();
    }
}