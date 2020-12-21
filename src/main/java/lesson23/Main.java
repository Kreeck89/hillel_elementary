package lesson23;

import lesson17.entities.Customer;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws Exception {
//        Action.move(100);
//        ActionImpl action = new ActionImpl();
//        int hello = action.getLength("Hello");
//        System.out.println("string length: " + hello);
//
//        SecondActionImpl secondAction = new SecondActionImpl();
//        secondAction.print("Hello");
//        int hello1 = secondAction.getLength("Hello");
//        System.out.println("secondAction. String length: " + hello1);

//        ThirdActionImpl thirdAction = new ThirdActionImpl();
//        int hello2 = thirdAction.getLength("Hello");
//        System.out.println("thirdAction. String length: " + hello2);

        //Optional

//        Optional<String> hello = Optional.of("Hello");
//        Optional<Object> empty = Optional.empty();
//        Optional<String> hello1 = Optional.ofNullable("Hello");
//
//        System.out.println(hello1.get());
//
//        if (empty.isPresent()) {
//            System.out.println(empty.get());
//        }
//
//        Optional<String> string = getString(0);
//        String optionalString = string.orElse("default String");
//        System.out.println(optionalString);
//
//        Customer customer = getCustomer(0).orElse(new Customer());
//        getCustomer(0).orElseThrow(() -> new Exception());
//
//        Customer customerWithoutOptional = getCustomerWithoutOptional(0);
//        if (customerWithoutOptional == null) {
//            customerWithoutOptional = new Customer();
//        }

        //Functional Interface

//        Comparator<Integer> comparator = (a, b) -> a + b;
//        int result = comparator.compare(10, 20);
//        System.out.println("result: " + result);


//        List<String> list = Arrays.asList("second", "first", "third", "first");
//        System.out.println(list);
////        Collections.sort(list, new Comparator<String>() {
////            @Override
////            public int compare(String str1, String str2) {
////                return str1.compareTo(str2);
////            }
////        });
//
//        Collections.sort(list, (str1, str2) -> str1.compareTo(str2));
//        System.out.println(list);

        Predicate<String> predicate = (str) -> str.length() > 0;
        boolean predicateTest = predicate.test("s");
        System.out.println("predicateTest: " + predicateTest);

        Consumer<String> consumer = (str) -> {
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
        };
        consumer.accept("test string for print");

        Function<Integer, String> function = (value) -> String.valueOf(value) + "-result";
        String apply = function.apply(100);
        System.out.println("apply: " + apply);

        Supplier<Customer> supplier = () -> {
            Customer customer = new Customer();
            customer.setEmail("default@mail.com");
            return customer;
        };
        Customer customer = supplier.get();
        System.out.println(customer.toString());
    }

    private static Optional<String> getString(int condition) {
        if (condition == 0) {
            return Optional.empty();
        } else {
            return Optional.of(String.valueOf(condition));
        }
    }

    private static Optional<Customer> getCustomer(int customerId) {
        if (customerId == 0) {
            return Optional.empty();
        } else {
            Customer receivedCustomer = new Customer();
            return Optional.of(receivedCustomer);
        }
    }

    private static Customer getCustomerWithoutOptional(int customerId) {
        if (customerId == 0) {
            return null;
        } else {
            Customer receivedCustomer = new Customer();
            return receivedCustomer;
        }
    }


    private static boolean test(String string) {
        return string.length() > 0;
    }

    private static void print(String string) {
        System.out.println(string);
    }
}
