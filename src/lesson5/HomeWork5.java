package lesson5;

import java.io.FileWriter;
import java.io.FileReader;
import org.json.*;
import java.io.IOException;

public class HomeWork5 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.csv");

            writer.append("Name");
            writer.append(',');
            writer.append("email");
            writer.append('\n');

            writer.append("sample");
            writer.append(',');
            writer.append("sample@sample.com");
            writer.append('\n');

            writer.append("demo");
            writer.append(',');
            writer.append("demo@demo.com");
            writer.append('\n');

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader("test.txt")) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
