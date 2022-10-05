import java.util.*;
public class Llist
{
    Node head,tail;
    class Node
    {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    void insertEle(int data){
        Node newNode=new Node(data);
        if(head==null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    void display()
    {
        Node n1=head;
        if(tail==null && head==null) {
            System.out.println("Circular linkedlist is empty , nothing to display");
        }
        else {
            do{
                System.out.println(n1.data);
                n1=n1.next;
            }while(n1!=head);
        }
    }
    void deleteele()
    {
       if(tail!=head)
       {
           head=head.next;
           tail.next=head;
       }
       else
       {
           head=tail=null;
       }
    }
    public static void main(String args[])
    {
        Llist list1=new Llist();
        list1.insertEle(2);
        list1.insertEle(7);
        list1.insertEle(8);
        list1.display();
        list1.deleteele();
        System.out.println();
        list1.display();

    }
}
