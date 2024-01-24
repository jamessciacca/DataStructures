package Abstract.Interface;

import java.util.Arrays;
import java.util.Comparator;

abstract class Plumber{
    protected String name;
    protected String companyName;

    public static int numPlumbers;

    public static String[] companyNames;

    public Plumber(String name, String companyName){
        this.name = name;
        this.companyName = companyName;
        numPlumbers++;
    }

    public String getCompanyName(){
        return companyName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + " from " + companyName;
    }

    public abstract void fixLeak();
    public static void sortPlumbers(Plumber[] plumbers){
        Arrays.sort(plumbers, Comparator.comparing(Plumber:: getCompanyName));
    }
}

//new class!
class ResidentialPlumber extends Plumber implements PerformService{
    public ResidentialPlumber(String name, String companyName){
        super(name, companyName);
    }

    public void fixLeak(){
        System.out.println("Residential Plumber " + name + " from " + companyName + " fixed the leak");
    }

    public void PerformService(){
        System.out.println("Residential Plumber " + name + " from " + companyName + " performed the service");
    }
}

//new class!
class CommercialPlumber extends Plumber implements PerformService{
    public CommercialPlumber(String name, String companyName){
        super(name, companyName);
    }

    public void fixLeak(){
        System.out.println("Commercial Plumber " + name + " from " + companyName + " fixed the leak");
    }

    public void PerformService(){
        System.out.println("Commercial Plumber " + name + " from " + companyName + " performed the service");
    }
}

//writing the interface
interface PerformService{
    void PerformService();
}

public class Plumbers {
    public static void main(String[] args){
        Plumber[] plumbers = new Plumber[3];
        plumbers[0] = new ResidentialPlumber("John", "ABC Plumbing");
        plumbers[1] = new CommercialPlumber("Mike", "Poop Plumbing");
        plumbers[2] = new ResidentialPlumber("Joe", "Plumbing Co.");

        for(Plumber p : plumbers){
            p.fixLeak();
        }

        Plumber.sortPlumbers(plumbers);

        for(Plumber p : plumbers){
            System.out.println(p);
        }

        for(Plumber p : plumbers){
            if(p instanceof PerformService){
                ((PerformService)p).PerformService();
            }
        }
    }
 }
