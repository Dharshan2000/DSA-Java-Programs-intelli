import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        int indexfound=stack.search(1);
        System.out.println(indexfound);
        //Iteration over stack
        System.out.println();
        Iterator it=stack.iterator();
        while (it.hasNext())
        {
            Object s2=it.next();
            System.out.println(s2);
        }

    }
}
