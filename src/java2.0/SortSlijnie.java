import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        
         if (a == null) {
            return null;
        }
        if (a.length < 2) {
            return a; 
        }
        int [] arrayB = new int[a.length / 2];
        System.arraycopy(a, 0, arrayB, 0, a.length / 2);
        int [] arrayC = new int[a.length - a.length / 2];
        System.arraycopy(a, a.length / 2, arrayC, 0, a.length - a.length / 2);
        arrayB = mergeSort(arrayB); 
        arrayC = mergeSort(arrayC);

        return mergeArrays(arrayB, arrayC);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a = new int[a1.length + a2.length];
        int i = 0, i1 = 0, i2 = 0;

        while (i1 < a1.length && i2 < a2.length) a[i++] = a1[i1] < a2[i2] ? a1[i1++] : a2[i2++];
        while (i1 < a1.length) a[i++] = a1[i1++];
        while (i2 < a2.length) a[i++] = a2[i2++];
        return a;
    }

    
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class SortSlijnie{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
