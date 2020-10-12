package lesson1;

public class Main {
    public static void main(String[] args) {
//        lesson1.User user = new lesson1.User();
////        user.name = "Alex";
//
//        user.print();
//
//        final int calc = calc(5, 10);
////        calc += 10;
//        System.out.println("calc: " + calc);


//        lesson1.Animal animal = new lesson1.Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

//        animal.setType("lesson1.Animal");
        cat.setType("lesson1.Cat");
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
