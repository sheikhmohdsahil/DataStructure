package DataStructure;

import java.util.HashSet;
import java.util.Set;

public class setExample {

    public static void main(String[] args) {

        Set<Ball> balls=new HashSet<>();
        balls.add(new Ball("yellow"));
        balls.add(new Ball("blue"));

        //we added blue again which will be ignored by the Set
        balls.add(new Ball("blue"));

        balls.add(new Ball("Red"));

        //To iterate set
        balls.forEach(System.out::println);

        //To find the size of set
        System.out.println(balls.size());

        //To remove an elememt from set
        balls.remove(new Ball("Red"));

        balls.forEach(System.out::println);

        System.out.println("After removing an element : "+balls.size());
    }
    record Ball(String color) {}
}