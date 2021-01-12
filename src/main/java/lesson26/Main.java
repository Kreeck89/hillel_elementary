package lesson26;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");
        list.forEach(System.out::println);

        boolean result = list.stream().anyMatch(str -> !str.isEmpty());
        System.out.println("result: " + result);

        //since Java 9
        Set<String> set = Set.of("1", "2", "3");
        List.of();
        Map.of();

        String str = "string";
        String resultString;

        if (!str.isEmpty()) {
            resultString = str;
        } else {
            resultString = "EMPTY";
        }
        resultString = !str.isEmpty() ? str : "EMPTY";

        resultString = Objects.requireNonNullElse(str, "EMPTY");

        //since Java 10
        var example = "example";
        example = "example2";
    }
}
