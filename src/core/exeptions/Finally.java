package core.exeptions;

public class Finally {
    public static void main(String[] args) {
        System.out.println(файналли());
    }

    private static int файналли() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
