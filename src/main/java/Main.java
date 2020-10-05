public class Main {
    public static void main(String[] args) {
//        User user = new User();
////        user.name = "Alex";
//
//        user.print();
//
//        final int calc = calc(5, 10);
////        calc += 10;
//        System.out.println("calc: " + calc);


//        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

//        animal.setType("Animal");
        cat.setType("Cat");
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
