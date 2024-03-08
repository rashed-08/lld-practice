package dependency_inversion;

public class Main {
    public static void main(String[] args) {
        Robot walkingRobot = new WalkingRobot();
        Robot flyingRobot = new FlyingRobot();


        MainRobot main1 = new MainRobot(walkingRobot);
        main1.start();
        System.out.println("========================");
        MainRobot main2 = new MainRobot(flyingRobot);
        main2.start();
    }
}
