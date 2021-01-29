package lesson31.factory;

public class JPGDocument implements Document {
    @Override
    public void print() {
        System.out.println("JPG Document");
    }
}
