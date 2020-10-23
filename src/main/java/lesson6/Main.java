package lesson6;

import lesson1.Cat;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1 == string2);
        String str = new String("Hello");

        System.out.println(str == string1);

        char[] chars = {' ', 'h', 'i', 'l', 'l', 'e', 'l', ' ', ' '};
        String stringChars = new String(chars);

        System.out.println("stringChars.length(): " + stringChars.length());

        char[] chars1 = stringChars.toCharArray();
        System.out.println("stringChars.toCharArray(): " + Arrays.toString(chars1));

        System.out.println("stringChars.trim(): " + stringChars.trim());

        System.out.println("stringChars.trim(): " + stringChars.isEmpty());

        String empty = "    ";
        System.out.println("empty.trim(): " + empty.trim().isEmpty());

        Cat cat = new Cat();
        System.out.println(String.valueOf(cat));

        char charAt = stringChars.charAt(3);
        System.out.println("stringChars.charAt(3): " + charAt);

        System.out.println("stringChars.trim().concat(str): " + stringChars.trim().concat(str));

        System.out.println("str.equalsIgnoreCase(\"HELLO\"): " + str.equalsIgnoreCase("HELLO"));

        System.out.println("stringChars.substring(5): " + stringChars.substring(5));
        System.out.println("stringChars.substring(5, 6): " + stringChars.substring(5, 6));

        System.out.println("str.toUpperCase(): " + str.toUpperCase());

        //Java 11
        System.out.println("stringChars.strip(): " + stringChars.strip());

        System.out.println("\"   \".isBlank(): " + "   ".isBlank());

        String repeat = stringChars.repeat(3);
        System.out.println("stringChars.repeat(3): " + repeat);

        String lines = "first\n" +
                "second\n" +
                "third";
        lines.lines().forEach(System.out::println);


        //String regex

        String hillel = stringChars.trim();
        System.out.println(hillel.matches("^h.*l$"));

        hillel = hillel.concat(" ").repeat(3);
        String[] strings = hillel.split(" ");
        System.out.println("hillel.split(\"l\"): " + Arrays.toString(strings));

        System.out.println("hillel.replace(\"l\", \"L\"): " + hillel.replace("hillel", "Hello"));
        System.out.println("hillel.replace(\"l\", \"L\"): " + hillel.replace("l", "Q"));
        System.out.println("hillel.replaceAll(\"l\", \"L\"): " + hillel.replaceAll("l", "L"));

        //String.format
        System.out.println(String.format("Main method. hillel = %s, hillel.length = %d", hillel, hillel.length()));
        System.out.println("Main method. hillel = " + hillel + ", hillel.length = " + hillel.length());
        System.out.println("Main method. hillel = ".concat(hillel).concat(", hillel.length = ").concat(String.valueOf(hillel.length())));
        System.out.println(String.format("%s %s %s", str, string1, string2));


        //RegEx
        String regex = "[^a-z]il(l|or)[0-9]{1}e7?l$";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher("Hilor3el");

        System.out.println(matcher.matches());
//        System.out.println(matcher.find());

    }
}
