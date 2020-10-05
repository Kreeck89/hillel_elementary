package Lesson1;

public class Main {
    public static void main(String[] args) {
//        Lesson1.User user = new Lesson1.User();
////        user.name = "Alex";
//
//        user.print();
//
//        final int calc = calc(5, 10);
////        calc += 10;
//        System.out.println("calc: " + calc);


//        Lesson1.Animal animal = new Lesson1.Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

//        animal.setType("Lesson1.Animal");
        cat.setType("Lesson1.Cat");
        dog.setType("dog");

        cat.go();
        dog.go();

        cat.say();
        dog.say();


        Animal animalCat = new Cat();
        Animal animalDog = new Dog();

        methodAnimal(animalCat);
        methodAnimal(animalDog);
    }

    private static int calc(int a, int b) {
        return a + b;
    }

    private static void methodAnimal(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).go();
        }
        if (animal instanceof Cat) {
            ((Cat) animal).go();
        }
    }

    private static void methodCat(Cat cat) {

    }

    private static void methodDog(Dog dog) {

    }
}
