package DataStructure;

import java.util.LinkedList;
import java.util.ListIterator;



public class LinkedlistExample {

    public static void main(String[] args) {
        LinkedList<Person> l1 = new LinkedList<>();
        l1.add(new Person("xyz", 21));
        l1.add(new Person("abc", 22));
        l1.add(new Person("prq", 21));
        l1.addFirst(new Person("abcd",23));
        ListIterator<Person> p1 = l1.listIterator();

        // To iterate LinkedList in inserted order
        while (p1.hasNext()) {
            System.out.println(p1.next());
        }

        System.out.println("========================");

        // To iterate LinkedList in reverse order
        while (p1.hasPrevious()) {
            System.out.println(p1.previous());
        }

    }

    static record Person(String name, int age) {
    }
}
