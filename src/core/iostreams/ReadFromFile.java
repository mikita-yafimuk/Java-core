package core.iostreams;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileReader("f:/persons.txt"));

        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                System.out.println("INT: " + scan.nextInt());
            }
            else {
                System.out.println("STRING: " + scan.next());
            }
        }

        double sum = 0.0;
        Scanner scan1 =
                new Scanner("1.3;2.0; 8.5; 4.8; 9.0; 1; 100");
        scan1.useDelimiter(";\\s*");
        while (scan1.hasNext()) {
            if (scan1.hasNextDouble()) {
                sum += scan1.nextDouble();
            }
            else if (scan1.hasNextInt()) {
                sum += (double) scan1.nextInt();
            }
            else {
                scan1.next();
            }
        }
        System.out.printf("SUM = " + sum);

    }
}
