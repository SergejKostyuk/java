import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TheSortArray {

    public static void main(String[] args) {
        int length = 10;
        List<Integer> list = getRandom(length);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

    private static List<Integer> getRandom(int length) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            list.add(random.nextInt());
        }

        return list;
    }
}