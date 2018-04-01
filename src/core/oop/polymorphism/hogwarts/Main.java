package core.oop.polymorphism.hogwarts;

public class Main {

    public static void main(String[] args) {

        Faculty[] hogwarts = new Faculty[] {
                new Gryffindor(), new Slytherin(), new Ravenclaw(), new Hufflepuff()
        };

        for (Faculty faculty : hogwarts)
            faculty.getFaculty();
    }
}
