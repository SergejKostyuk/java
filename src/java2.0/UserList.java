// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class UserList {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
LinkedList<String> linkedList = new LinkedList<>();
while (true) {
System.out.println("Введите строку вида text~num для добавления элемента в список");
System.out.println("print~num для вывода и удаления элемента");
System.out.println("для завершения программы введите end");
String str = scanner.nextLine();
if (str.equals("end") ) break;
String[] strSplit = str.split("~");
String text = strSplit[0];
int num = Integer.parseInt(strSplit[1]);
if (text.equals("print")) {
if (num >= 0 && num < linkedList.size()) {
System.out.println(linkedList.get(num));
linkedList.remove(num);
}
else{
System.err.println("Ошибка! Неверный номер позиции!");
}
System.out.println(linkedList);
}
else{
if (num >= 0 && num <= linkedList.size()) {
linkedList.add(num, text);

}
else{
System.err.println("Ошибка! Неверный номер позиции!");
}

System.out.println(linkedList);
}

}
scanner.close();
}

}