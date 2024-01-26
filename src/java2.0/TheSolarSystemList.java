// 📌 Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheSolarSystemList {
    public static void main(String[] args) {
        List<String> listPlanets = getListPlanets();
        System.out.println(listPlanets);
        countRepeatPlanet(listPlanets);

        deleteRepeatPlanet(listPlanets);
        System.out.println(listPlanets);

        // List<String> list1 = new ArrayList<>(Arrays.asList("Меркурий", "Венера"));

    }

    private static void deleteRepeatPlanet(List<String> listPlanets) {
        for (int i = 0; i < listPlanets.size(); i++) {
            String planet = listPlanets.get(i);
            for (int j = i + 1; j < listPlanets.size(); j++) {
                if (listPlanets.get(j).equals(planet)) {
                    listPlanets.remove(j);
                    j--;
                }
            }
        }
    }

    private static void countRepeatPlanet(List<String> listPlanets) {
        List<String> listSortedPlanet = new ArrayList<>(listPlanets);

        Collections.sort(listSortedPlanet);
        System.out.println(listSortedPlanet);

        int count = 1;
        String currentPlanet = listSortedPlanet.get(0);
        for (int i = 1; i < listSortedPlanet.size(); i++) {
            if (listSortedPlanet.get(i).equals(currentPlanet)) {
                count++;
            } else {
                System.out.println(currentPlanet + " -> " + count);
                currentPlanet = listSortedPlanet.get(i);
                count = 1;
            }
        }
        System.out.println(currentPlanet + " -> " + count);
    }

    private static List<String> getListPlanets() {
        List<String> list = new ArrayList<>();
        list.add("Меркурий");
        list.add("Земля");
        list.add("Марс");
        list.add("Венера");
        list.add("Юпитер");
        list.add("Меркурий");
        list.add("Нептун");
        list.add("Уран");
        list.add("Сатурн");
        list.add("Юпитер");
        list.add("Земля");
        return list;
    }

}
