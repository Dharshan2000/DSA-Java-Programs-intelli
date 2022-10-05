import java.util.*;
public class Llist {
    public static void main(String args[])
    {
        LinkedList<Integer> obj=new LinkedList<>();
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(2,0);
        Iterator it=obj.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println("size : "+obj.size());
        boolean b1=obj.contains(5);
        System.out.println(b1);
        Stack<String> s1=new Stack<>();
        LinkedList<String> l2=new LinkedList<>();

        s1.push("hello");
        s1.push(" everyone");

        l2.addAll(s1);
        Iterator it2=obj.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

    }
}
