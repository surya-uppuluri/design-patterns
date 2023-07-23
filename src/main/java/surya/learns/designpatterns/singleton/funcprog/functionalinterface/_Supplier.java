package surya.learns.designpatterns.singleton.funcprog.functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    static Supplier<String> getDbUrlSupplier = () -> "jdbc://localhost:5432/users";

    public static void main(String[] args) {
        System.out.println(getDBUrl());
        System.out.println(getDbUrlSupplier.get());
    }

    static String getDBUrl(){
        return "jdbc://localhost:5432/users";
    }

}
