package Lab1Question1;

public class AnimalTest {
    public static void main(String[] args) {
        Dove dove = new Dove();
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();
        Penguin penguin = new Penguin();
        Seagull seagull = new Seagull();
        Rattlesnake rattlesnake = new Rattlesnake();
        Turtle turtle = new Turtle();
        ColdBlooded[] coldBloodedAnimals = { rattlesnake, turtle, penguin };
        OceanDwelling[] oceanDwellingAnimals = { penguin, seagull, turtle };
        System.out.println("Cold-blooded animals:");
        for (ColdBlooded animal : coldBloodedAnimals) {
            System.out.println(animal.getClass().getSimpleName());
        }
        System.out.println("\nOcean Dwelling Animals:");
        for (OceanDwelling animal : oceanDwellingAnimals) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}
