// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.FileWriter;
import java.io.IOException;

public class WriteStringToFile {
public static String createRepeatWord(String str, int numberOfWords) {
StringBuilder stringBuilder = new StringBuilder();
for (int i = 0; i < numberOfWords ; i++) {
stringBuilder.append(str);
}
return stringBuilder.toString();
}

public static void writeToFile(String str, String fileName) {
try (FileWriter fileWriter = new FileWriter(fileName)) {
fileWriter.write(str);
System.out.println("Запись успешна!");
} catch (IOException e) {
System.err.println("Ошибка записи в файл!");

}

}
public static void main(String[] args) {

String str = createRepeatWord("TEST", 100);
writeToFile(str, ".");
}
}