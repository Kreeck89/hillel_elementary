package lesson31.prototype;

import lesson1.Cat;

public class Bot implements Cloneable {
    private String name;
    private String type;
    private int charger;
//    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCharger() {
        return charger;
    }

    public void setCharger(int charger) {
        this.charger = charger;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Bot{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", charger=" + charger +
                '}';
    }
}
