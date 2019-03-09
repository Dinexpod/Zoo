package mate.academy.hw.zoo.animals;

public abstract class Fish implements Animal {
    @Override
    public void toEat() {
        System.out.println("I'm eating as fish!");
    }

    @Override
    public void move() {
        System.out.println("I'm swimming!");
    }
}
