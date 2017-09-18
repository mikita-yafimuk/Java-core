package OOP.Robot;

public class Robot {
    private double x = 0;
    private double y = 0;
    private String name;
    //Кус в градусах
    protected double course = 0;

    public Robot(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Robot(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public void forward(int distance) {
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    public void back(int distance) {
        forward(-distance);
    }

    public void printCoordinates() {
        System.out.println("x: " + x + ", y: " + y);
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
