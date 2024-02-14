package Lab1Question3;

public class FlyingTest {
    public static void main(String[] args) {
        
        Animal goose = new Goose();
        Animal lynx = new Lynx();
        Flying flyingGoose = new Goose();
        Flying airplane = new Airplane();
        
        goose.move();
        goose.speak();
        flyingGoose.fly();
        lynx.move();
        lynx.speak();
        airplane.fly();
    }

}
