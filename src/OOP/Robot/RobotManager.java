package OOP.Robot;

public class RobotManager {

    public static void main(String[] args) {
        RobotTotal robot = new RobotTotal(15,15, 0, "Nikita");

        robot.forward(40);
        robot.printCoordinates();
        robot.back(20);
        robot.printCoordinates();
        System.out.println(robot.toString() + ", total distance: " + robot.getTotalDistance());

    }
}
