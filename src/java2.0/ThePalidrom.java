// 📌 Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

public class ThePalidrom {

public static boolean isPalidrom(String str) {

int len = str.length() / 2;
int lastIndex = str.length() - 1;

for (int i = 0; i < len; i++) {
if (str.charAt(i) != str.charAt(lastIndex)) {
return false;
}
--lastIndex;
}

return true;
}

public static void main(String[] args) {
String str = "abcbba";
System.out.println(isPalidrom(str));
}
}