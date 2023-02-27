package DataStructure;

import java.util.LinkedList;

import java.util.Queue;

public class QueueExample {

    public static void main(String[] args){
        Queue<Person>  superMarket = new LinkedList<>();

        superMarket.add(new Person("alex",21 ));
        superMarket.add(new Person("mariyam",24 ));
        superMarket.add(new Person("jack",22 ));

        System.out.println(superMarket.peek());

        System.out.println(superMarket.size());

        // poll() is used to pop an element
        System.out.println(superMarket.poll());

        System.out.println(superMarket.size());
    }


    static  record Person(String name,int age){}
}
