package DataStructure;

import java.util.ArrayList;
import java.util.List;

class ListExample {

    public static void main(String[] args){

        List colors= new ArrayList();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        colors.add(1);
        colors.add(new Object());
        System.out.println(colors);

        System.out.println(colors.size());
        System.out.println(colors.contains("purple"));
        System.out.println(colors.contains("black"));



        // 1St way to loop an list
        for(Object color:colors){
            System.out.println(color);
        }
        // 2nd way to loop an list
        colors.forEach(System.out::println);



        // 3rd way to loop an list
        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
    }
}












