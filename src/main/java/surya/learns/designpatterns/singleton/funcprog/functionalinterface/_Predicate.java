package surya.learns.designpatterns.singleton.funcprog.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    static Predicate<String> isValidPhone = phoneNumber -> phoneNumber.startsWith("09") && phoneNumber.length() == 11;

    static Predicate<String> contains9 = phoneNumber -> phoneNumber.contains("9");


    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println(isValidPhone.and(contains9).test("09000000000"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("09") && phoneNumber.length() == 11;
    }

}
