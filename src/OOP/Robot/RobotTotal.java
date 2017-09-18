package OOP.Robot;

public class RobotTotal extends Robot {

    private double totalDistance = 0;

    public RobotTotal(double x, double y) {
        super(x,y);
    }

    public RobotTotal(double x, double y, double course, String name) {
        super(x,y, "Nikita");
        this.course = course;
    }

    @Override
    public void forward(int distance) {
        super.forward(distance);
        totalDistance += distance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }


}
