public class CounterMaxOnes {
    
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        System.out.println(counterMaxOnes(array));

    }
        static int counterMaxOnes(int[] arr) {
            // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
            // максимальное количество подряд идущих 1.
            int count = 0;
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count++;
                    // max = count > max ? count : max;
                    max = Math.max(count, max);
                } else {
                    count = 0;
                }
            }
            return max;
         }
}
