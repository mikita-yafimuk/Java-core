package core.iostreams;

import java.io.*;

public class Copier {
    public static void main(String[] args) throws IOException {
        byte[] data = {'N', 'i', 'k', 'i', 't', 'a'};
        InputStream in = new ByteArrayInputStream(data);
        OutputStream out = new FileOutputStream("f:/test.txt");
        copy(in, out);
        buffcopy(in, out);
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        in.close();
        out.flush();
        out.close();
    }

    public static void buffcopy(InputStream in, OutputStream out) throws IOException {
        byte[] buff = new byte[256];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
        in.close();
        out.flush();
        out.close();
    }
}
