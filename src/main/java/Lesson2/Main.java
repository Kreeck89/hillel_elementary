package lesson2;

import lesson1.Animal;
import lesson1.Cat;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //LIST EXAMPLE
//        ArrayList list = new ArrayList(10000);
//        list.add("first");
//        list.add(0,"second");
//        list.add("third");
//        list.set(2, "4");
//
//
//        System.out.println(list);
//        System.out.println("list.get(0): " + list.get(0));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print("list.get(i): " + list.get(i) + " / ");
//        }
//        System.out.println();
//
//        boolean contains = list.contains("4");
//        System.out.println("list.contains(\"4\"): " + contains);
//        list.remove("4");
//
//        contains = list.contains("4");
//        System.out.println("list.contains(\"4\"): " + contains);
//
//        list.clear();
//        System.out.println("list.size(): " + list.size());
//        System.out.println("list.isEmpty(): " + list.isEmpty());


        //SET EXAMPLE

//        HashSet set = new HashSet();
//        set.add("first");
//        set.add("second");
//        set.add("first");
//
//        System.out.println("set.size(): " + set.size());
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("iterator.next(): " + iterator.next());
//        }

        //MAP EXAMPLE
//        HashMap map = new HashMap();
//        map.put(1, "firsts");
//        map.put(2, "second");
//        map.put(3, "first");
//
//        System.out.println("map.containsValue(\"first\"): " + map.containsValue("first"));
//        System.out.println(map.size());
//
//        map.put(3, "4");
//        System.out.println("map.containsValue(\"first\"): " + map.containsValue("first"));
//        System.out.println(map.size());
//
//        map.put("first", "first");
//        System.out.println("map.containsValue(\"first\"): " + map.containsValue("first"));
//        System.out.println(map.size());
//
//        Set set = map.keySet();
//        Collection values = map.values();

        //Wrapper(Integer / Long....)
//        Integer integer = 10;
//        int i = 10;
//        byte b = integer.byteValue();

        //GENERICS
//        ArrayList badList = new ArrayList();
//        badList.add(2);
//        badList.add("first");
//        badList.add(new Cat());
//        badList.add(new Dog());
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("first");
//        list.add("new Cat()");
//
//        ArrayList<List<String>> lists = new ArrayList<>();
//        ArrayList<String> answers = new ArrayList<>();
//        answers.add("yes");
//        answers.add("no");
//
//        lists.add(answers);
//
//        HashMap<String, List<String>> map = new HashMap<>();
//        map.put("Vasia", answers);

        //WILDCARDS
        ArrayList<Animal> animals = new ArrayList<>();
        wildcardsExtends(animals);

        ArrayList<Cat> cats = new ArrayList<>();
        wildcardsExtends(cats);

        wildcardsSuper(animals);
        wildcardsSuper(cats);
    }

    private static void wildcardsExtends(List<? extends Animal> animals) {
//        animals.add(new Cat());
    }

    private static void wildcardsSuper(List<? super Cat> cats) {
        cats.add(new Cat());
    }



}
