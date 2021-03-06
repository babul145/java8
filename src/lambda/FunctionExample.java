package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> squareIt = i -> i * i;
        System.out.println(squareIt.apply(5));

        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println(isEven.test(5));

        PrintFunctionalInterface cfi = () -> System.out.println("hello");
        cfi.print();

        SumFunctionalInterface sfi = (a, b) -> System.out.println("sum: " + (a + b));
        sfi.sum(10, 20);
    }
}
