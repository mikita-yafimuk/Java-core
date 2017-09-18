package OOP.MyIdea;

public class Men extends Human implements Hunting, GainResources {

    public Men (String name, int age){
        super(name, age);
        Human.countHuman++;
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }

    @Override
    public void gainResources() {
        System.out.println(getName() + " is gaining resources");
    }
}
