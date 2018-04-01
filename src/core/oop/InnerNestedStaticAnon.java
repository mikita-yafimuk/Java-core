package core.oop;

public class InnerNestedStaticAnon {
    private int a = 1;
    private static int b = 1;

    static class NestedStatic {
        void print() {
            //System.out.println(a);
            System.out.println(b);
        }
    }
    class Inner {
        void print() {
            System.out.println(a);
            System.out.println(b);
        }
    }
}

class Test {
    private static String className = Test.class.getName();
    public static void main(String[] args) {
        InnerNestedStaticAnon.NestedStatic nestedStatic = new InnerNestedStaticAnon.NestedStatic();
        InnerNestedStaticAnon innerNestedStaticAnon = new InnerNestedStaticAnon();
        InnerNestedStaticAnon.Inner inner = innerNestedStaticAnon.new Inner();

        new Thread(new Runnable() {
            @Override
            public void run() {
                nestedStatic.print();
                System.out.println(className);
                inner.print();
            }
        }).start();
    }
}
