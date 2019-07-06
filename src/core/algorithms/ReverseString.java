package core.algorithms;

public class ReverseString {

    public static void main(String[] args) {
        String stringForReverse = "Nikita Efimuk";
        first(stringForReverse);
        second(stringForReverse);
        System.out.println(new StringBuilder(stringForReverse).reverse());
        third(stringForReverse);
    }

    private static void first(String stringForReverse) {
        char[] str = stringForReverse.toCharArray();
        int lenght = str.length;
        int i, j;
        char temp;

        for(i = 0, j = lenght - 1; i < j; i++, j--) {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        System.out.println(str);

    }

    private static void second(String stringForReverse) {
        char[] data = stringForReverse.toCharArray();

        for (int i = 0; i < stringForReverse.length() / 2; i++) {
            char tmp = data[i];
            data[i] = data[stringForReverse.length() - i - 1];
            data[stringForReverse.length() - i - 1] = tmp;
        }
        System.out.println(data);
    }

    private static void third(String stringForReverse) {
        String result = "";
        for (int i = stringForReverse.length() - 1; i >= 0; i--)
        {
            result += stringForReverse.charAt(i);
        }
        System.out.println(result);
    }
}


