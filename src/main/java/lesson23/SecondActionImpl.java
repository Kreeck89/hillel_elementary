package lesson23;

public class SecondActionImpl implements Action {

    @Override
    public void print(String string) {
        System.out.println("SecondActionImpl: " + string);
    }

    @Override
    public int getLength(String string) {
        return string.length() * 10;
    }
}
