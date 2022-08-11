package lesson_20220811;

import java.io.File;
import java.io.FileWriter;

public class Files {
    public static void main(String[] args) {

        String filename1 = "src/lesson_20220811/testMe1.txt";
        String filename2 = "src/lesson_20220811/testMe2.txt";

        try {
            File file = new File(filename1);
            file.createNewFile();

            System.out.println("File #1 is created!");

            FileWriter writer = new FileWriter(filename2);
            writer.write("Some text..");
            writer.close();

            System.out.println("File #2 is created!");
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
