package mate.academy.hw.zoo;

import mate.academy.hw.zoo.animals.Animal;
import mate.academy.hw.zoo.animals.Tiger;
import mate.academy.hw.zoo.aviaries.AnimalCage;
import mate.academy.hw.zoo.aviaries.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger();


        List<Zoo> zoos = new ArrayList<>();

        AnimalCage animalCage = new AnimalCage();

        zoos.add(animalCage);
        animalCage.addAnimal(tiger);

        animalCage.feed();
    }
}
