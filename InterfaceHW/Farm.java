package InterfaceHW;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private ArrayList <Animal> myFarm;

    public Farm(){
        myFarm = new ArrayList<Animal>();
    }

    public void addAnimal(Animal a){
        myFarm.add(a);
    }

    public void singOldMacDonald(){
        for (Animal a : myFarm){
            System.out.println("Old MacDonald had a farm, E-I-E-I-O");
            System.out.println("And on his farm he had a " + a.getType() + ", E-I-E-I-O");
            System.out.println("With a " + a.makeSound() + " " + a.makeSound() + " here");
            System.out.println("And a " + a.makeSound() + " " + a.makeSound() + " there");
            System.out.println("Here a " + a.makeSound() + ", there a " + a.makeSound() + ", everywhere a " + a.makeSound() + " " + a.getSound());
            System.out.println("Old MacDonald had a farm, E-I-E-I-O");
            System.out.println();
        }
    }

    public void singVerse(){
        System.out.println("Old MacDonald had a farm, E-I-E-I-O");
    }
}
