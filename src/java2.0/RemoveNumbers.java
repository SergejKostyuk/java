import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbers {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Текст", "12", "-21", "Hello!", "0", "sff"));
        removeInteger(list);
        System.out.println(list);

    }

    private static void removeInteger(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (isInteger(temp)) {
                iterator.remove();
            }

        }
    }

    public static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
