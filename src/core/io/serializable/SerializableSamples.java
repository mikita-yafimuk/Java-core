package core.io.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SerializableSamples {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(buff);

        out.writeObject("Hello!");
        out.writeObject(123);
        out.writeObject(new byte[][] {{0, 1}, {0, 2}});
        out.flush();
        out.close();

        byte[] data = buff.toByteArray();
        System.out.println(new String(data, "UTF-8"));

        ObjectInput input = new ObjectInputStream(new ByteArrayInputStream(data));
        System.out.println((String)input.readObject());
        System.out.println((Integer) input.readObject());
        System.out.println(Arrays.deepToString((byte[][])input.readObject()));
    }
}
