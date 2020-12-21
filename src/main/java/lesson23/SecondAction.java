package lesson23;

public interface SecondAction {

    default int getLength(String string) {
        return string.length() * 100;
    }
}
