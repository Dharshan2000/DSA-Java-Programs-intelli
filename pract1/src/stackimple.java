import java.util.*;
public class stackimple {
private Node top;
private int size;

private class Node{
    private int data;
    private Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    public void push(int data)
    {
        Node tempnode=new Node(data);
        tempnode.next=top;
        top=tempnode;
        size++;
    }
    public int pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        size--;
        return result;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public int peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public void display()
    {
        Node current=top;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String args[])
    {
        Stack stack=mew Stack();
        stack.push()
    }
}
}
