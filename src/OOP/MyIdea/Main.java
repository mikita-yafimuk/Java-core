package OOP.MyIdea;

public class Main {
    public static void main(String[] args) {
        Men ignat = new Men("Ignat", 33);
        Women vasilisa = new Women("Vasilisa", 22);
        Baby barabos = new Baby("Barabos", 4.3);
        ignat.hunt();
        vasilisa.bearChildren();
        barabos.cry();
    }
}
