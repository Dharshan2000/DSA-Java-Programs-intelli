import java.util.*;
public class Stack {
    private Node top;
    private int size;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data) {
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
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
    public int peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public int size()
    {

        return size;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public void display()
    {
        Node current = top;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String args[])
    {
        Stack stack=new Stack();
        System.out.println(stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}

