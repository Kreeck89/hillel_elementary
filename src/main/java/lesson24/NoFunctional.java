package lesson24;

public class NoFunctional {

    public boolean test(String string) {
        return string.isEmpty();
    }

    public void accept(Integer integer) {
        System.out.println("received integer: " + integer);
    }

    public String apply(Integer integer) {
        return "RESULT: ".concat(String.valueOf(integer));
    }

    public String get() {
        return "some_property";
    }
}
