package lesson23;

public interface Action{

    void print(String string);

    static void move(int distance) {
        System.out.println("Action. distance: " + distance);
    }

    default int getLength(String string) {
        return string.length();
    }
}
