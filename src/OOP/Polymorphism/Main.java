package OOP.Polymorphism;

public class Main {

    public static void main(String[] args) {

        Hogwarts[] hogwarts = new Hogwarts[] {
                new Gryffindor(), new Slytherin(), new Ravenclaw(), new Hufflepuff()
        };

        for (Hogwarts faculty : hogwarts)
            faculty.getFaculty();
    }
}
