package core.collections;
import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Before pop " + stack);

        System.out.println("After first pop we lost number " + stack.pop());
        System.out.println("Stack after first pop " + stack);

        System.out.println("After second pop we lost number " + stack.pop());
        System.out.println("Stack after second pop " + stack);
    }
}
