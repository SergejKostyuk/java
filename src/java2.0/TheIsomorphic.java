// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;
import java.util.Map;

public class TheIsomorphic {

public static Boolean isIsomorphic(String s, String t) {

if (s.length() != t.length())
return false;
if (s.equals(t))
return true;

Map<Character, Character> map = new HashMap<>();

for (int i = 0; i < s.length(); i++) {
if (map.containsKey(s.charAt(i)) &&
map.get(s.charAt(i)) != t.charAt(i)) {
return false;
} else {
map.put(s.charAt(i), t.charAt(i));
}
}

return true;
}

public static void main(String[] args) {
String s, t;
s = "foo";
t = "bar";

Boolean isIsomorph = isIsomorphic(s, t);
System.out.printf("Is isomorphic: %s", isIsomorph);
}
}