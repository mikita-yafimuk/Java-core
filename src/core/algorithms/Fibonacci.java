package core.algorithms;

public class Fibonacci {

    public static void main(String[] args) {
/*        int[] a = new int[10];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i < a.length; i++){
            a[i] = a[i-2] + a[i-1];
            System.out.print(a[i] + " ") ;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("fib(" + i + ") = " + fib(i));
        }*/

        fibsout(5);
    }

    public static int fib(int arg) {
        return arg < 2 ? 1 : fib(arg - 2) + fib(arg - 1);
    }

    public static int fibsout(int arg) {
        System.out.print(" " + arg);
        return arg < 2 ? 1 : fibsout(arg - 2) + fibsout(arg - 1);
    }
}
