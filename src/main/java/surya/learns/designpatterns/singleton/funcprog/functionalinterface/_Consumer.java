package surya.learns.designpatterns.singleton.funcprog.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class _Consumer {

    static Consumer<String> nameConsumer = name -> System.out.println("Hello, " + name);
    static BiConsumer<String, Boolean> nameBiConsumer = (name, shouldExclaim) -> System.out.println("Hello, " + name + (shouldExclaim ? "!" : ""));


    public static void main(String[] args) {
        greetThem("Sudha");
        nameConsumer.accept("Sudha");
        nameBiConsumer.accept("Sudha", true);
        nameBiConsumer.accept("Sudha", false);
    }

    static void greetThem(String name) {
        System.out.println("Hello, " + name);
    }

}
