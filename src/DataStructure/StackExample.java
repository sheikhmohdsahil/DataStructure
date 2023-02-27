package DataStructure;

import java.util.Stack;
public class StackExample {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //To check the peek
        System.out.println((stack.peek()));

        //To check the size of stack
        System.out.println(stack.size());

        //To print which element is poped from List
        System.out.println(stack.pop());
        System.out.println(stack.size());
        //to check whether stack is empty or not
        System.out.println(stack.isEmpty());

    }
}
