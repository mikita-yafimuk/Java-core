package test;

public class Table extends Furniture {
    protected int type;
    // ...
    public Table (int type) {
        this.type = type;
    }
    public Table (int weight, int type) {
        super(weight);
        this.type = type;
    }

    public static void main(String[] args) {
        Table table = new Table(2);
    }
}
