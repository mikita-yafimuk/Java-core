package other;

public class ATriangle {

    public static void main(String[] args) {
        final double MAX_VALUE = 999999999;
        double a;
        double b;
        double c;

        if (args.length == 3) {
            for (String i : args) {
                if (i.equals("0") || (i.contains("-"))) {
                    System.out.println("Negative and(or) zero numbers are not allowed.");
                    System.exit(1);
                }
                if (i.equalsIgnoreCase("help")) {
                    showHelp();
                }
            }

            a = getNumber(args[0]);
            b = getNumber(args[1]);
            c = getNumber(args[2]);

            if ( (a >= MAX_VALUE) || (b >= MAX_VALUE) || (c >= MAX_VALUE) ) {
                System.out.println("Your number(s) is(are) too large.\n" +
                        "Please, use numbers in range [1 - 999 999 999].");
            } else {
                showType(a, b, c);
            }

        } else {
            showHelp();
        }
    }


    /*
    * this method checks and converts (if it possible) String value to Double value
    * if not - program will be closed
    */
    private static double getNumber(String value) {
        try {
            return Double.valueOf(value);
        } catch (NumberFormatException ex) {
            System.out.println("Sorry, but " + "'" + value + "'" + " is not a number.\n" +
                    "For get more information enter next command: \n" +
                    "java ATriangle help");
            System.exit(1);
            return Double.NaN;
        }
    }

    /*
    * this method shows to user what kind of triangle he got
    * type of triangle depends of variables which that user gave
    */
    private static void showType(double a, double b,
                                 double c) {

        boolean triangle = ((a < (b + c)) & (b < (c + a)) & (c < (a + b)));
        boolean equilateral = ((a == b) & (b == c));
        boolean isosceles = ((a == b) || (c == b) || (c == a));
        boolean scalene = ((a != b) & (b != c));
        boolean line = (((a + b) == c) || ((a + c) == b) || ((c + b) == a));

        if (triangle) {
            if (equilateral) {
                System.out.println("It's an equilateral(равносторонний) triangle.");
            } else if (isosceles & (!line)) {
                System.out.println("It's an isosceles(равнобедренный) triangle.");
            } else if (scalene) {
                System.out.println("It's a scalene(разносторонний) triangle.");
            }
        } else
            System.out.println("It's not a triangle.");

        if (line) {
            System.out.println("It's a line.");
        }
    }

    private static void showHelp() {
        System.out.println("This java file defines the type of triangle.\n" +
                "Sorry, but you should follow the input rules.\n" +
                "Use next command: \n" +
                "java ATriangle <length of the first side> <length of the second side> <length of the third side>\n" +
                "(<length> should be a positive number in range [1 - 999 999 999])");
    }
}
