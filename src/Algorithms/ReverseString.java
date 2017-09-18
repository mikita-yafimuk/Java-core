package Algorithms;

public class ReverseString {
    public static void main(String[] args) {
        String tesString = "Hello, world";
        char[] str = tesString.toCharArray();
        int lenght = str.length;
        int i, j;
        char temp;

        for(i = 0, j = lenght - 1; i < j; i++, j--) {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        System.out.print(str);
    }
}
