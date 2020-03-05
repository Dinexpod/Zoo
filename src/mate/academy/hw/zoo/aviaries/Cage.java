package mate.academy.hw.zoo.aviaries;

import mate.academy.hw.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Cage<T extends Animal>{

    private List<Animal> cage = new ArrayList<>();

    public void setAnimalCage(T animal) {
        this.cage.add(animal);
    }

    public void addAnimal(T animal) {
        setAnimalCage(animal);
    }

    public void feed() {
        cage.stream().forEach(animal -> animal.toEat());
    }
}
