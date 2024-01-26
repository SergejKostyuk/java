import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int i , int n) {
           // Введите свое решение ниже
      int l = i * 2 + 1;
      int r = i * 2 + 2;
      int largest = i;
      if (l < n && tree[l] > tree[largest])
        largest = l;
      if (r < n && tree[r] > tree[largest])
        largest = r;
      if (i != largest){
        int temp = tree[i];
        tree[i] = tree[largest];
        tree[largest] = temp;
        buildTree(tree, largest, n);
      }
        
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
      int n1 = sortLength;
      for(int i = n1 / 2 - 1; i >= 0; i--)
         buildTree(sortArray, i, n1);
      for (int i = n1 - 1; i >= 0; i--){
        int temp = sortArray[i];
        sortArray[i] = sortArray[0];
        sortArray[0] = temp;
        buildTree(sortArray, 0, i);
      }
    }
}

// Не удаляйте и не меняйте метод Main! 
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}