import java.io.*;
import java.util.Scanner;

public class Main {
    public static final String FILE_NAME = "test.txt";

    public static void main(String[] args) {
   

        write(FILE_NAME);
        read(FILE_NAME);
    }

    public static void write(String fileName) {
        try {

            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Adina duishobaeva");
            fileWriter.close();

            System.err.println("Ваши данные успешно записались успешно в файл ");

        } catch (IOException e) {
            System.out.println("Ошибка при написании данных в файл ");
            System.out.println(e.getMessage());
        }

    }

    public static void read(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("К сожалению мы не смогли найти твой файл убедись правильности имени файла ");
            System.out.println(e.getMessage());
        }
    }
}