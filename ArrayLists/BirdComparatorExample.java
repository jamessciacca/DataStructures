package ArrayLists;

import java.util.ArrayList;
//holds allof our data structure classes
import java.util.Collections;
import java.util.Comparator;

public class BirdComparatorExample{
    public static void main(String[] args){
        ArrayList<Bird>birds = new ArrayList<>();

        birds.add(new Bird("Robin", " SongBird"));
        birds.add(new Bird("Eagle", " Bird of Prey"));
        birds.add(new Bird("Duck", " Waterfowl"));
        birds.add(new Bird("Ostrich", " Flightless Bird"));

        System.out.println("List of Birds before sort: " + birds);

        //using comparator
        Comparator<Bird>nameComparator = Comparator.comparing(Bird:: getName);
        Collections.sort(birds, nameComparator); 
        System.out.println("List of Birds after sort: " + birds);     
    };    
}


class Bird {
    private String name;
    private String species;

    public Bird(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String toString() {
        return name + species;
    }

}
