package lesson5;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork5 {
    public static void main(String [] args)
    {
        generateCsvFile("d:\\test.csv");
    }

    private static void generateCsvFile(String sFileName)
    {
        try
        {
            FileWriter writer = new FileWriter(sFileName);

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

            //generate whatever data you want

            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
