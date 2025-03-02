public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        shelter.enqueue(new Dog("Snoopy", "Male", 2));
        shelter.enqueue(new Dog("Buffy", "Female", 8));
        shelter.enqueue(new Cat("Casper", "Male", 12));
        shelter.enqueue(new Dog("Paris", "Female", 6));

        System.out.println("Queued Animal: " + shelter.dequeueAny().name());
        System.out.println("Queued Dog: " + shelter.dequeueDog().name());
        System.out.println("Queued Cat: " + shelter.dequeueCat().name());
    }
}