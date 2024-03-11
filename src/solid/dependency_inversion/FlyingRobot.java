package solid.dependency_inversion;

public class FlyingRobot implements Robot {
    @Override
    public void move() {
        System.out.println("Flying Robot Move");
    }

    @Override
    public void makeSound() {
        System.out.println("Flying Robot MakeSound");
    }
}
