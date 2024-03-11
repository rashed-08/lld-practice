package solid.dependency_inversion;

public class MainRobot {
    private Robot robot;
    public MainRobot(Robot robot) {
        this.robot = robot;
    }

    public void start() {
        robot.move();
        robot.makeSound();
    }
}
