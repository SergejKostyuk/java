// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class ArrayNumEnd {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(Arrays.toString(nums));
        int val = 2;
        moveToEnd(nums, val);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveToEnd(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (nums[right] == val) {
            right --;          
        }
        while (left < right) {
            if (nums[left] == val){
                nums[left] = nums[right];
                nums[right] = val;
                right--;
            }
            left ++;    
        }
    }
    
}
