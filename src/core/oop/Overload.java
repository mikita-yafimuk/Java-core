package core.oop;

public class Overload {

    public double summa(double x1, double x2) {
        return x1 + x2;
    }

    public double summa(double x1, double x2, double x3) {
        return x1 + x2 + x3;
    }

    public double summa(double x1, double x2, double x3, double x4) {
        return x1 + x2 + x3 + x4;
    }

    public static void main(String[] args) {
        Overload test = new Overload();

        System.out.println(test.summa(1,2));
        System.out.println(test.summa(1,2,3));
        System.out.println(test.summa(1,2,3,4));
    }
}
