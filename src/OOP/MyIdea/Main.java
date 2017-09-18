package OOP.MyIdea;

public class Main {
    public static void main(String[] args) {
        Men man1 = new Men("Ignat", 33);
        Women woman1 = new Women("Vasilisa", 22);
        Baby baby1 = new Baby("Barabos", 4.3);
        man1.hunt();
        woman1.bearChildren();
        baby1.cry();
    }
}
