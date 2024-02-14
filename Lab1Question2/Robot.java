package Lab1Question2;

abstract class Robot {
}

class RobotA extends Robot {
}

class RobotB extends Robot implements Locomotion {
    @Override
    public void forward() {
        System.out.println("RobotB is going forward");
    }

    @Override
    public void reverse() {
        System.out.println("RobotB is Reversing");
    }

    @Override
    public void stop() {
        System.out.println("RobotB Stopped");
    }
}

class RobotC extends Robot implements Locomotion, sound {
    @Override
    public void forward() {
        System.out.println("RobotC is going forward");
    }

    @Override
    public void reverse() {
        System.out.println("RobotC is Reversing");
    }

    @Override
    public void stop() {
        System.out.println("RobotC Stopped");
    }

    @Override
    public void beep() {
        System.out.println("RobotC is Beeping.");
    }
}

// robotA1
class RobotA1 extends RobotA implements sound {
    @Override
    public void beep() {
        System.out.println("RobotA1 is Beeping.");
    }
}

class RobotB1 extends RobotB implements sound {
    @Override
    public void beep() {
        System.out.println("RobotB1 is Beeping.");
    }

    public void stop() {
        System.out.println("RobotB1 Stopped");
    }
}

class RobotB2 extends RobotB {
    public void stop() {
        System.out.println("RobotB2 Stopped");
    }
}

class RobotC1 extends RobotC {
    public void stop() {
        System.out.println("RobotC1 Stopped");
    }
}

interface Locomotion {
    void forward();

    void reverse();

    void stop();
}

interface sound {
    void beep();
}
