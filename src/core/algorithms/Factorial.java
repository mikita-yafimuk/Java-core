package core.algorithms;

public class Factorial {
    private static int fact(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static int fact_rec(int x) {
        return x == 1 ? 1 :  x * fact_rec(x-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(fact_rec(3));
    }
}
