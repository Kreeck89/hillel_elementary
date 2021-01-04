package lesson25;

import lesson1.Cat;
import lesson25.entities.Human;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Создание коллекции
        List<String> list = Arrays.asList("first", "second", "third");
        //Стрим, который вернет Обертку с/без объекта внутри
        Optional<String> first = list.stream()
                .filter(string -> string.contains("i"))
                .findAny();

        //Получение объекта из Обертки. Если пустая, то вернет заданное значение
        System.out.println(first.orElse("UNKNOWN"));

        //Стрим проверит наличие в коллекции элемента с условием и вернет новую коллекцию
        List<String> stringList = list.stream()
                .filter(string -> string.contains("i"))
                .collect(Collectors.toList());

        //Примитивы/Ссылки на объекты в ходе выполнения потак не изменяются
        int result = 0;
        Cat cat = new Cat();
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.map(val -> {
            val++;
//            result++;
//            cat = new Cat();
            return val;
        }).forEach(val -> System.out.println(val));

        List<String> collect = list.stream().filter(string -> string.contains(" "))
                .parallel().collect(Collectors.toList());


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> integerList = integers.stream()
                .map(Converter::convertToString) //Ссылочные методы. Пример применения вызова статичыеского метода
                .map(string -> string.concat(" "))
                .collect(Collectors.toList());

//        integerList.forEach(System.out::println);

        Converter converter = new Converter();

        List<String> parallelStreamResult = integers.parallelStream()
//                .skip(5)
                .filter(string -> string != 5)
                .map(converter::validate) //Ссылочные методы. Пример применения вызова не статичыеского метода конкретного объекта
                .collect(Collectors.toList());

        parallelStreamResult.forEach(System.out::println);

        List<String> strings = integerList.stream()
                .map(String::valueOf)
                .map(String::toUpperCase) //Ссылочные методы. Пример применения вызова не статичыеского метода любого объекта конкретного типа
                .collect(Collectors.toList());

        List<String> digits = Arrays.asList("1", "12", "34", "94");
        List<Integer> intList = digits.stream()
                .map(Integer::new) //Ссылочные методы. Пример применения вызова конструктора
                .collect(Collectors.toList());

        //Из коллекции строк с ходе стрима мапим и получаем Объекты необходимого класса
        List<String> names = Arrays.asList("Alex", "Bob", "Oleg");
        Set<Human> humans = names.stream()
                .map(Human::new) //Ссылочные методы. Пример применения вызова конструктора
                .collect(Collectors.toSet());

        humans.forEach(human -> System.out.println(human.getName()));

        List<String> humanNames = humans.stream()
                .map(Human::getName)
                .collect(Collectors.toList());


        //Пример работы с Date/LocalDate/LocalTime/LocalDateTime
        Date date = new Date();
        System.out.println(date.getTime());

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        System.out.println(calendar.getWeekYear());

        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTimeNow.getHour());

        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow.atStartOfDay());

        LocalDateTime of = LocalDateTime.of(1990, 2, 28, 12, 30);
        System.out.println(of);
        System.out.println(date);

        System.out.println(localDateNow.getEra());
        System.out.println(localDateNow.isLeapYear());
        LocalDate localDate = localDateNow.minusDays(1);


        LocalDateTime localDateTimeNow = LocalDateTime.now();
    }
}
