package StreamsInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' to exit");
        do {
            str = br.readLine();
            System.out.println(str);
        }
        while(!str.equalsIgnoreCase("stop"));
    }

}
