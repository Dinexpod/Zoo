package mate.academy.hw.zoo.aviaries;

import mate.academy.hw.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Cage implements Zoo<Animal> {

    private List<Animal> animalCage = new ArrayList<>();

    public void setAnimalCage(Animal animal) {
        this.animalCage.add(animal);
    }

    @Override
    public void addAnimal(Animal animal) {
       setAnimalCage(animal);
        System.out.println(animalCage.size());
    }

    @Override
    public void feed() {
        animalCage.stream().forEach(animal -> animal.toEat());
    }
}
