import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


class Answer {
    public static void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
      ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
      Collections.sort(nums);

      System.out.println(nums);
      System.out.println("Minimum is " + nums.get(0));
      System.out.println("Maximum is " + nums.get(nums.size()-1));
      
      int sum =0;
      for (int i:nums) {
        sum +=i;        
      }
      System.out.println("Average is = " + (double)sum/nums.size());
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Analizspiska { 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}