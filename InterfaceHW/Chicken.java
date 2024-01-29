package InterfaceHW;

public class Chicken implements Animal{
    
    @Override
    public String makeSound() {
        if (Math.random() < 0.5) {
            return "bawk!";
        } else {
            return "cluck";
        }
    }

    @Override
    public String getType() {
        return "Chicken";
    }

}
