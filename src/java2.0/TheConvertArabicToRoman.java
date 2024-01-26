// Написать метод, который переведёт данное целое число в римский формат.
// 1000, "M"
// 900, "CM"
// 500, "D"
// 400, "CD"
// 100, "C"
// 90, "XC"
// 50, "L"
// 40, "XL"
// 10, "X"
// 9, "IX"
// 5, "V"
// 4, "IV"
// 1, "I"

import java.util.LinkedHashMap;
import java.util.Map;

public class TheConvertArabicToRoman {

public static Map<Integer, String> getMapArabicToRoman() {
Map<Integer, String> numbers = new LinkedHashMap<>();

numbers.put(1000, "M");
numbers.put(900, "CM");
numbers.put(500, "D");
numbers.put(400, "CD");
numbers.put(100, "C");
numbers.put(90, "XC");
numbers.put(50, "L");
numbers.put(40, "XL");
numbers.put(10, "X");
numbers.put(9, "IX");
numbers.put(5, "V");
numbers.put(4, "IV");
numbers.put(1, "I");

return numbers;

}

public static String convertArabicToRoman(int number) {

if(number > 3999) return "Not correct number";
Map<Integer, String> numbers = getMapArabicToRoman();
StringBuilder result = new StringBuilder();

for (int key : numbers.keySet()) {
while (number >= key) {
result.append(numbers.get(key));
number -= key;
}
}

return result.toString();
}

public static void main(String[] args) {
int number = 4000;
String result = convertArabicToRoman(number);
System.out.printf("%d -> %s", number, result);
}
}