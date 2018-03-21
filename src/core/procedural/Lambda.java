package core.procedural;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);

        System.out.println("Sum: " + sumAll(numbers, number -> true));
        System.out.println("Sum: " + sumAll(numbers, number -> number % 2 == 0));
        System.out.println("Sum: " + sumAll(numbers, number -> number > 3));
    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> predicate) {
        int total = 0;
        for(int number : numbers) {
            if (predicate.test(number)) {
                total += number;
            }
        }

        return total;
    }
}
