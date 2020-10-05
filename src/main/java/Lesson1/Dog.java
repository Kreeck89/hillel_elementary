package Lesson1;

public class Dog extends Animal implements AnimalContract {

    @Override
    public void say() {
        System.out.println("Say");
        System.out.println("Say");
        System.out.println("Say");
        System.out.println("Say");
        System.out.println("Say");
    }

    @Override
    public void hearing() {
        //TODO: init
    }

    public void go() {
        System.out.println("Lesson1.Dog is going...");
    }
}
