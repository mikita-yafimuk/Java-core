package OOP.MyIdea;

public class Baby extends Human implements Cry {
    private double weight;

    public Baby(String name, double weight) {
        super(name);
        this.weight = weight;
        Human.countHuman++;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void cry() {
        System.out.println("Baby " + getName() + " is crying");
    }
}
