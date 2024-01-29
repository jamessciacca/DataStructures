package InterfaceHW;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void singOldMacDonald() {
        System.out.println("Old MacDonald had a farm. E-I-E-I-O!");
        for (Animal animal : animals) {
            System.out.println("And on that farm he had a " + animal.getName() + ". E-I-E-I-O!");
            System.out.println("With a " + animal.getSound() + " here and a " + animal.getSound() + " there...");
        }
        System.out.println("Old MacDonald had a farm. E-I-E-I-O!");
    }
}
