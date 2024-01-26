package CAT;
// Задание №3
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
// использовать не все придуманные поля и методы. Создайте несколько
// экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
// его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** VetClinica */
// import CatClass;

public class VetClinica {

    public static void main(String[] args) {
        CatClass vaska = new CatClass("Peter", "Vaska", "Red", "Dvorterier", 2);
        CatClass murka = new CatClass("Ivan", "Murka", "Grey", "Siam", 1);
        CatClass barsik = new CatClass("Ivan", "Barsik", "Brown", "Sibirian", 3);

        Set<CatClass> cats = new HashSet<>(Arrays.asList(vaska, murka, barsik));

        for (CatClass cat : cats) {
            System.out.println(cat);
        }
        }
    }