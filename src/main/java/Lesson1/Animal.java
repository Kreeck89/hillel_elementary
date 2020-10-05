package Lesson1;

public abstract class Animal {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void say() {
        System.out.println("Lesson1.Animal can't say anything");
    }

    public abstract void hearing();
}
