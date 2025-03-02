import java.util.Queue;
import java.util.LinkedList;

public class Shelter {
    private Queue<Dog> dogQueue = new LinkedList<>();
    private Queue<Cat> catQueue = new LinkedList<>();

    public void enqueue (Animal animal){
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }

    public Dog dequeueDog(){
        return dogQueue.poll();
    }

    public Cat dequeueCat(){
        return catQueue.poll();
    }

    public Animal dequeueAny(){
        if (dogQueue.isEmpty()) return dequeueCat();
        if (catQueue.isEmpty()) return dequeueDog();
    }
}