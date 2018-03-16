package core.algorithms;

public class ReverseString {

    public static void main(String[] args) {
        String tesString = "Nikita Efimuk";
        first(tesString);
        second(tesString);
    }

    private static void first(String tesString) {
        char[] str = tesString.toCharArray();
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

    private static void second(String str) {
        char[] data = str.toCharArray();

        for (int i = 0; i < str.length() / 2; i++) {
            char tmp = data[i];
            data[i] = data[str.length() - i - 1];
            data[str.length() - i - 1] = tmp;
        }
        System.out.println(data);
    }
}


