package core.exeptions;

public class Exeptions {

    public static void main(String[] args) {
        try {
            double[] array = new double[10];
            array[11] = 1;
            System.out.println(array[11]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This block works always");
        }

        System.out.println("___________________________");

        try {
            int number = 1;
            if (number == 1) throw new Exception("This is one");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("___________________________");
    }
}
