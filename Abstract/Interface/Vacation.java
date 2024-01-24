package Abstract.Interface;

import java.util.Arrays;
import java.util.Comparator;

abstract class Vacation {
    
    protected String location;
    protected double duration;
    
    public static int numOfVacations;
    public static String[] locations;

    public Vacation(String location, double duration){
        this.location = location;
        this.duration = duration;
        numOfVacations++;
    }

    public String getLocation(){
        return location;
    }

    public double getDuration(){
        return duration;
    }

    public String toString(){
        return location + " for " + duration + " days";
    }

    public String getVacationName(){
        return location;
    }

    public abstract void plan();

    public static void sortVacations(Vacation[] vacations){
        Arrays.sort(vacations, Comparator.comparing(Vacation:: getVacationName));
    }
}

//new class
class BeachVacation extends Vacation implements VacationPlan{
    public BeachVacation(String location, double duration){
        super(location, duration);
    }

    @Override
    public void plan(){
        System.out.println("Lets Go");
    }

    public void packSunScreen(){
        System.out.println("Packed");
    }
}

class MountainVacation extends Vacation implements VacationPlan{
    public MountainVacation(String location, double duration){
        super(location, duration);
    }

    @Override
    public void plan(){
        System.out.println("Lets Go");
    }

    public void packSunScreen(){
        System.out.println("Packed");
    }

    public void packWarmClothes(){
        System.out.println("Packed Warm Clothes");
    }
}

interface VacationPlan{
    void packSunScreen();
}

class VacationTest{
    public static void main(String[] args){
        Vacation[] vacations = new Vacation[3];

        vacations[0] = new BeachVacation("Hawaii", 7);
        vacations[1] = new BeachVacation("Bahamas", 5);
        vacations[2] = new MountainVacation("Colorado", 3);


        Vacation.sortVacations(vacations);

        for(Vacation v : vacations){
            System.out.println(v);
        }

        System.out.println("Number of Vacations: " + Vacation.numOfVacations);
    }
}
