package other;

import java.io.*;

public class HTMLtable {
    public static void main(String[] args) throws IOException {
        // строка для записи в файл со структурой html документа
        String file = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>File</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <style>\n" +
                "        *{margin:0;padding: 0}\n" +
                "        tr{width: 100%; height: 4px; display: block;}\n" +
                "        body{width: 100%}\n" +
                "        table{width: 100%}" +
                "</style>" +
                "    <table>\n";
//окончание содержимого html-файла
        String fileEnd = "    </table>\n" +
                "</body>\n" +
                "</html>";
        String color = "";

        String[] samples = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

        for (int i = samples.length - 1; i > 0; i--) {
            for (int j = samples.length - 1; j > 0; j--) {
                String colorPart = samples[i] + samples[j]; //цвет, изменяющийся за счет прохождению по циклу

                color = colorPart + colorPart + colorPart;
//дописывание в общую структуру html документа строк таблицы с изменяющимся фоном
                file += "       <tr style=\"background-color: #" + color + "\"></tr>\n";
            }
        }

        file += fileEnd; //сборка всего содержимого для записи в файл

        File f = new File("F:/prj04.html"); //создание html файла с заданным именем
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(file); //запись необходимых данных в файл
        bw.close();
        if (f.exists()) //уведомление для пользователя, если файл успешно создан
            System.out.println("The file has created.");
    }
}
