package core.algorithms;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }
    }

    private static int fib(int arg) {
        return arg < 2 ? 1 : fib(arg - 2) + fib(arg - 1);
    }

}
