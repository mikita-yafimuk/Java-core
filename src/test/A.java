package test;

public class A {
    private static int n = 10;

    public static void main(String[] args) {
        metod1(n); //значение переменной n останется = 10;

        A a = new A();
        metod2(a); //значение переменной n станет = 12;

        A b = new A();
        metod4(a, b); //значение a.l останется = 3, b.l останется = 6;
    }

    public static void metod1(int _n) {
        _n = _n * 3; //значение переменной _n станет = 30, но _n удалится после завершения работы метода;
    }

    public static void metod2(A _a) {
        _a.metod3(2); //изменяет состояние объекта, на который ссылаются как переменая _a, так и переменная a;
    }

    public void metod3(int _p) {
        n = n + _p; //увеличивает значение переменной n на _p;
    }

    private static void metod4(A _a, A _b) {
        A temp = _a;
        _a = _b; //значение _a.l теперь = 6;
        _b = temp; //значение _b.l теперь = 3;
        //по завершении метода переменные _a и _b уничтожаются;
    }
}
