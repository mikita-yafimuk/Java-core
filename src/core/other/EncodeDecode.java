package core.other;

public class EncodeDecode {
    public static void main(String[] args) {
        String message = "Nikita Efimuk";
        String key = "encode";

        byte[] encoded = encode(message, key);
        String encodedStr = new String (encoded);

        System.out.println(encodedStr);
        System.out.println(decode(encoded, key));

    }

    private static byte[] encode(String message, String key) {
        byte[] btext = message.getBytes();
        byte[] bkey = key.getBytes();
        byte[] result = new byte[message.length()];

        for (int i = 0; i < btext.length; i++) {
            result[i] = (byte) (btext[i] ^ bkey[i % bkey.length]);
        }

        return result;
    }

    private static String decode(byte[] message, String key) {
        byte[] result = new byte[message.length];
        byte[] bkey = key.getBytes();

        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) (message[i] ^ bkey[i % bkey.length]);
        }

        return new String(result);
    }
}
