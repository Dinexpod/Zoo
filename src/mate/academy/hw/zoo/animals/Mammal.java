package mate.academy.hw.zoo.animals;

public abstract class Mammal implements Animal {
    @Override
    public void toEat() {
        System.out.println("I am eating as Mammal");
    }

    @Override
    public void move() {
        System.out.println("I am running");
    }
}
