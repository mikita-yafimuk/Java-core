package other;

import java.io.UnsupportedEncodingException;

public class Strings {
    public static void main(String[] args) throws UnsupportedEncodingException {
/*        String str1, str2 = "Hello";
        String str3 = new String(", world");*/

        String str1 = new String();
        char[] data1 = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String str2 = new String(data1, 2, 3);
        char[] data2 = { '\u004A', '\u0062', 'V', 'A' };
        String str3 = new String(data2);
        byte ascii[] = { 65, 66, 67, 68, 69, 70 };
        String str4 = new String(ascii); // ”ABCDEF”
        byte[] data3 = { (byte) 0xE3, (byte) 0xEE };
        String str5 = new String(data3, "CP1251"); // ”го”
        String str6 = new String(data3, "CP866"); // ”ую”

        if(str2.equals(str3)) {
            System.out.println("str2 == str3");
        }
        if(str2.equalsIgnoreCase(str3)) {
            System.out.println("str2 == str3");
        }

        str3.length();

        String strInt = "123";
        String strDouble = "123.456";
        int x;
        double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt = " + strInt);
        System.out.println("strDouble = " + strDouble);
        String strN;
        strN = "num = " + x;
        System.out.println(strN);

        StringBuffer log = new StringBuffer();
        log.append("Log entry 1");
        log.append("Log entry 2");
        log.append("Log entry 3");
        System.out.println(log.toString());
    }
}
