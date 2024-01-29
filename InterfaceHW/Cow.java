package InterfaceHW;

public class Cow implements Animal {
    
    @Override
    public String makeSound() {
        return "Moo";
    }

    @Override
    public String getType() {
        return "Cow";
    }
}
