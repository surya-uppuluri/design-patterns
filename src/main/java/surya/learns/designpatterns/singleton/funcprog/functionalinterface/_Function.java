package surya.learns.designpatterns.singleton.funcprog.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementByOneFunction = num -> num + 1;
    static Function<Integer, Integer> multiplyBy10Function = num -> num * 10;
    static BiFunction<Integer, Integer, Integer> addByOneAndThenMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyWith) -> (numberToIncrementByOne + 1) * numberToMultiplyWith;

    /**
     * Why to use function?
     *
     * @param args
     */
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);
        Integer apply = incrementByOneFunction.apply(1);
        System.out.println(apply);

        int multiply = multiplyBy10Function.apply(apply);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOneFunction.andThen(multiplyBy10Function);

        Integer apply1 = addByOneAndThenMultiplyByTen.apply(20);

        System.out.println(apply1);

        Integer apply2 = addByOneAndThenMultiplyBiFunction.apply(5, 10);
        System.out.println(apply2);

    }

    static int incrementByOne(int number) {
        return number + 1;
    }
}
