package mate.academy.hw.zoo;

import mate.academy.hw.zoo.animals.Animal;
import mate.academy.hw.zoo.animals.Penguin;
import mate.academy.hw.zoo.animals.Shark;
import mate.academy.hw.zoo.animals.Sparrow;
import mate.academy.hw.zoo.animals.Tiger;
import mate.academy.hw.zoo.aviaries.AnimalCage;
import mate.academy.hw.zoo.aviaries.Aquarium;
import mate.academy.hw.zoo.aviaries.BirdCage;
import mate.academy.hw.zoo.aviaries.Cage;

import java.util.ArrayList;
import java.util.List;

public class Main {

   private static List<Cage> zoo = new ArrayList<>();

    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal penguin = new Penguin();
        Animal shark = new Shark();
        Animal sparrow = new Sparrow();

        Cage animalCage = new AnimalCage();
        Cage birdCage = new BirdCage();
        Cage aquarium = new Aquarium();

        zoo.add(animalCage);
        zoo.add(birdCage);
        zoo.add(aquarium);


        animalCage.addAnimal(tiger);
        birdCage.addAnimal(sparrow);
        birdCage.addAnimal(penguin);
        aquarium.addAnimal(shark);

        animalCage.feed();

        System.out.println("-----------------------------------------");

        Main.feedZOO();
    }

   static void feedZOO() {
        zoo.stream().forEach(cage -> cage.feed());
    }
}
