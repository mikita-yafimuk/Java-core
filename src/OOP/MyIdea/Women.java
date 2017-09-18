package OOP.MyIdea;

public class Women extends Human implements BearChildren, Cry {

    public Women (String name, int age){
        super(name, age);
        Human.countHuman++;
    }

    @Override
    public void bearChildren() {
        System.out.println(getName() + " is bearing children");
    }

    @Override
    public void cry() {
        System.out.println(getName() + " is crying");
    }
}
