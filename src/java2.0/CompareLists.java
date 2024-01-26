// 📌 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 📌 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
public static void main(String[] args) {
int count = 200_000;

System.out.println("Добавление в конец списка");
long start = System.currentTimeMillis();
addArrayListLast(count);
System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

start = System.currentTimeMillis();
addLinkedListLast(count);
System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

System.out.println();

System.out.println("Добавление в начало списка");
start = System.currentTimeMillis();
addArrayListFirst(count);
System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

start = System.currentTimeMillis();
addLinkedListFirst(count);
System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

System.out.println();

System.out.println("Добавление в середину списка");
start = System.currentTimeMillis();
addArrayListMiddle(count);
System.out.println("ArrayList: " + (System.currentTimeMillis() - start));

start = System.currentTimeMillis();
addLinkedListMiddle(count);
System.out.println("LinkedList: " + (System.currentTimeMillis() - start));


}

public static ArrayList<Integer> addArrayListLast(int count) {
ArrayList<Integer> arrayList = new ArrayList<>();
for (int i = 0; i < count; i++) {
arrayList.addLast(i);
}
return arrayList;
}

public static LinkedList<Integer> addLinkedListLast(int count) {
LinkedList<Integer> linkedList = new LinkedList<>();
for (int i = 0; i < count; i++) {
linkedList.addLast(i);
}
return linkedList;
}

public static ArrayList<Integer> addArrayListFirst(int count) {
ArrayList<Integer> arrayList = new ArrayList<>();
for (int i = 0; i < count; i++) {
arrayList.addFirst(i);
}
return arrayList;
}

public static LinkedList<Integer> addLinkedListFirst(int count) {
LinkedList<Integer> linkedList = new LinkedList<>();
for (int i = 0; i < count; i++) {
linkedList.addFirst(i);
}
return linkedList;
}

public static ArrayList<Integer> addArrayListMiddle(int count) {
ArrayList<Integer> arrayList = new ArrayList<>();
for (int i = 0; i < count; i++) {
arrayList.add(arrayList.size()/2, i);
}
return arrayList;
}

public static LinkedList<Integer> addLinkedListMiddle(int count) {
LinkedList<Integer> linkedList = new LinkedList<>();
for (int i = 0; i < count; i++) {
linkedList.add(linkedList.size()/2, i);
}
return linkedList;
}
}