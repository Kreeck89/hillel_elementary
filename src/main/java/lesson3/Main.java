package lesson3;

import lesson1.Animal;
import lesson1.Cat;
import lesson1.Dog;

import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        GenericMap<String, Animal, Integer> map = new GenericMap<>();
        map.add("Cat1", new Cat());
        map.add("Cat2", new Dog());

        HashMap map1 = new HashMap();

        TreeSet<String> strings = new TreeSet<>();

    }
}
