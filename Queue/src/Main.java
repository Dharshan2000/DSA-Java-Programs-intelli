import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Dharshan",21));
        supermarket.add(new Person("Manju",21));
        supermarket.add(new Person("Didu",19));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    static record Person(String name, int age){}
}
