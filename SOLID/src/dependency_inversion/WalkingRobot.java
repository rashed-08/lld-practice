package dependency_inversion;

public class WalkingRobot implements Robot {
    @Override
    public void move() {
        System.out.println("Walking Robot Move");
    }

    @Override
    public void makeSound() {
        System.out.println("Walking Robot MakeSound");
    }
}
