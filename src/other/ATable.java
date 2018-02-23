package other;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;


public class ATable {

    public static void main(String[] args) {

        if (args.length == 1) {

            File directory = new File(args[0]);

            try {
                createHTMLTable(directory);
            } catch (IOException e) {
                System.out.println("File creation was failed.");
            }

        } else if (args.length == 0){

            File directory = new File(".");

            try {
                createHTMLTable(directory);
            } catch (IOException e) {
                System.out.println("File creation was failed.");
            }
            showHelp();

        } else {
            System.out.println("Too many params.");
            showHelp();
        }

    }

    private static double calculateFolderSize(File directory) {
        double length = 0;

        try {
            for (File file : directory.listFiles()) {

                if (file.isFile())
                    length += file.length();
                else
                    length += calculateFolderSize(file);

            }
        } catch (NullPointerException e) {
            System.out.println("No access to folder: " + directory.getName());
        }

        return length;
    }

    private static void createHTMLTable(File directory) throws IOException {
        final String DIR_TYPE = "directory";
        final String FILE_TYPE = "file";

        if (directory.isDirectory()) {
            PrintWriter pw = new PrintWriter(new FileWriter("table.html"));
            System.out.println("File is creating...");
            pw.println("<TABLE BORDER><TR Bgcolor=\"#9e8b75\"><TH>Name<TH>Type<TH>Date of creation<TH>Size(KB)</TR>");

            for (File file : directory.listFiles()) {

                Path path = file.toPath();
                BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);

                if (file.isDirectory()) {
                    pw.println("<tr Bgcolor=\"#ffffff\"> <td>" + file.getName() +
                            "</td><td>" + DIR_TYPE + "</td> <td> " + editDate(attrs.creationTime())+ "</td><td>" +
                            editSize(calculateFolderSize(file) / 1024)  + "</td></tr> ");
                } else {
                    pw.println("<tr Bgcolor=\"#c1c1c1\"> <td>" + file.getName() +
                            "</td><td>" + FILE_TYPE + "</td> <td> " + editDate(attrs.creationTime())+ "</td><td>" +
                            (attrs.size() / 1024) + "</td></tr> ");
                }

            }
            pw.println("</TABLE>");
            pw.close();


            System.out.println("HTML file successfully created.");

        } else {
            System.out.println("'" + directory.getPath() + "'" + " does not exist");
        }
    }

    private static String editSize(double size) {
        return new DecimalFormat("#0.00").format(size);
    }

    private static String editDate(FileTime creationTime) {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return df.format(creationTime.toMillis());
    }

    private static void showHelp() {
        System.out.println("You could use next command: \n" +
                "java ATable <path to folder> \n" +
                "if your path has spaces you should use quotes.");
    }
}
