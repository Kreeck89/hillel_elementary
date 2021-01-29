package lesson31.factory;

public class JPGFactory implements Factory {
    @Override
    public Document getDocument() {
        return new JPGDocument();
    }
}
