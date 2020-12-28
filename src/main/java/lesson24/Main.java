package lesson24;

import lesson17.entities.Customer;
import lesson24.functional.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        NoFunctional noFunctional = new NoFunctional();
//        boolean hello = noFunctional.test("Hello");
//
//        PredicateInterface<String> predicateInterface = (string) -> string.isEmpty();
//        boolean helloPredicate = predicateInterface.test("Hello");
//        System.out.println(helloPredicate);
//
//        PredicateInterface<Integer> predicateInteger = (val) -> {
//            System.out.println("val: " + val);
//            val += val;
//            return val > 100;
//        };
//        boolean resultPredicateInteger = predicateInteger.test(100);
//        System.out.println("resultPredicateInteger: " + resultPredicateInteger);
//
//        ConsumerInterface<Boolean> consumerInterface = (bool) -> {
//            if (bool) {
//                System.out.println("boolean is true");
//            } else {
//                System.out.println("boolean is false");
//            }
//        };
//        consumerInterface.accept(false);
//
//        FunctionInterface<Integer, String> functionInterface = (integer) -> "RESULT: ".concat(String.valueOf(integer));
//        String apply = functionInterface.apply(100);
//        System.out.println("functionInterface.apply: " + apply);
//
//        SupplierInterface<String> supplierInterface = () -> "some_property";
//        String property = supplierInterface.get();
//        System.out.println("supplierInterface.get: " + property);
//
//        BiFunctionInterface<Integer, Integer, Integer> biFunctionInterface = (first, second) -> first + second;
//        Integer integer = biFunctionInterface.apply(10, 20);

        List<String> list = Arrays.asList("first", "second", "third", "1234567");
        Stream<String> stringStream = list.stream()
                .filter(string -> string.length() > 5)
                .map(string -> string.toUpperCase());
//         .map(string -> {
//                    Customer customer = new Customer();
//                    customer.setName(string);
//                    return customer;
//                });

//        stringStream.forEach(string -> System.out.println(string));
//        stringStream.forEach(string -> System.out.println(string)); // НЕВОЗМОЖНО ПОВТОРНОЕ ИСПОЛЬЗОВАНИЕ СТРИМА

        List<String> finalList = stringStream.collect(Collectors.toList());
        System.out.println(Arrays.toString(finalList.toArray()));

    }
}
