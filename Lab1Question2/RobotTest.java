package Lab1Question2;

public class RobotTest {
    public static void main(String[] args) {
        RobotA robotA = new RobotA();
        RobotA1 robotA1 = new RobotA1();
        RobotB robotB = new RobotB();
        RobotB1 robotB1 = new RobotB1();
        RobotB2 robotB2 = new RobotB2();
        RobotC robotC = new RobotC();
        RobotC1 robotC1 = new RobotC1();
    
        sound[] soundRobots = { robotA1, robotB1, robotC1 };
        
        Locomotion[] locomotionRobots = { robotB, robotB1, robotB2, robotC, robotC1 };
        
        for (sound soundRobot : soundRobots) {
            soundRobot.beep();
        }
        
        for (Locomotion locomotionRobot : locomotionRobots) {
            locomotionRobot.stop();
        }
    }

}
