package Lab1Question3;

interface Animal {
    void speak();

    void move();
}

abstract class Flying {
    abstract void fly();
}

class Goose extends Flying implements Animal {
    public Goose() {
    }

    @Override
    public void speak() {
        System.out.println("This goose speaks");
    }

    @Override
    public void move() {
        System.out.println("This goose moves forward");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " soars, wings flapping");
    }
}

class Lynx implements Animal {
    public Lynx() {
    }

    @Override
    public void speak() {
        System.out.println("This lynx speaks");
    }

    @Override
    public void move() {
        System.out.println("This lynx moves forward");
    }
}

class Airplane extends Flying {
    String name = "Airplane";

    public Airplane() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " engine running for fly");
    }
}
