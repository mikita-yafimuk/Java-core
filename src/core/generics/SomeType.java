package core.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SomeType<T> {

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    public void test(List<Integer> integerList) {
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
}

class ForExecute {
    public static void main(String[] args) {
        SomeType<String> someType = new SomeType();
        List<String> list = Arrays.asList("value");
        someType.test(list);
    }
}