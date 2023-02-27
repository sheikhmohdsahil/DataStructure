package DataStructure;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, Person> map=new HashMap<>();
        //To add key value to map
        map.put(1, new Person("abc"));
        map.put(2, new Person("xyz"));

        //This below map has same key value i.e 1 so it will not get added into map rather abc will get updated to pqr
        map.put(1, new Person("pqr"));


        System.out.println(map);

        //To find size
        System.out.println(map.size());

        //To get the value by using key value
        System.out.println(map.get(1));

        //To find out where map conatin specified key or not
        System.out.println(map.containsKey(4));

        //to print key values
        System.out.println(map.keySet());

        //To print entered values
        System.out.println(map.entrySet());

        //Iterate Map
        map.entrySet().forEach(System.out::println);

    }
    record Person(String name) {}
}