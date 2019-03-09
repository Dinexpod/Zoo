package mate.academy.hw.zoo.animals;

public abstract class Birds implements Animal {
    @Override
    public void toEat() {
        System.out.println("I'm eating as bird!");
    }

    @Override
    public void move() {
        System.out.println("I'm flying!");
    }
}
