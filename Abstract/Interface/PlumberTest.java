package Abstract.Interface;

public class PlumberTest {
   public static void main(String[] args){
        Plumber[] plumbers = new Plumber[3];
        plumbers[0] = new ResidentialPlumber("John", "ABC Plumbing");
        plumbers[1] = new CommercialPlumber("Mike", "Poop Plumbing");
        plumbers[2] = new ResidentialPlumber("Joe", "Plumbing Co.");
    }
}
