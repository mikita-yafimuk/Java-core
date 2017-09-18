package OOP.MyIdea;

abstract class Human {
    public static int countHuman = 0;
    private int age;
    private String name;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    void drink() {
        System.out.println("I am drinking");
    }

    void run() {
        System.out.println("I am running");
    }

    void eat() {
        System.out.println("I am eating");
    }
}
