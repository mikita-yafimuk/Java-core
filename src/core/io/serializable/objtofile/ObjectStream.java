package core.io.serializable.objtofile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStream {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("f:object.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(new User("Nikita", "1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
