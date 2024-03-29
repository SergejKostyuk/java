package ShopElectronic;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class ShopNotbook {
    private static Notbook filtrNotebook = new Notbook(null, 0, 0, "null", "null");

    public static void main(String[] args) {
        Notbook notebook1 = new Notbook("MacPro", 8, 1000, "Windows XP", "pink");
        Notbook notebook2 = new Notbook("HP Powilion 5", 16, 10000, "Windows 7", "black");
        Notbook notebook3 = new Notbook("MacPro", 8, 1000, "Windows XP", "white");
        Notbook notebook4 = new Notbook("Asus 1000", 32, 100000, "Windows 10", "white");
        Notbook notebook5 = new Notbook("Huawey", 2, 100, "Windows 8", "silwer");
        Notbook notebook6 = new Notbook("MacPro 2000", 64, 1000000, "Windows 11", "gold");

        Set<Notbook> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6));

        filter(notebooks);
    }

    public static void filter(Set<Notbook> notebooks) {
        information();
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        boolean endOfFiltr = true;
        while (endOfFiltr == true) {
            switch (command) {
                case ("1"):
                    System.out.println("Вы можете ввести желаемый объем оперативной памяти и вам будут представлены варианты ноутбуков такого объема и выше.");
                    int findRamInGB = Integer.valueOf(sc.nextLine());
                    filtrNotebook.setRamInGB(findRamInGB);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("2"):
                    System.out.println("Вы можете ввести желаемый объем жесткого диска и вам будут представлены варианты ноутбуков такого объема и выше.");
                    int findValueHDD = Integer.valueOf(sc.nextLine());
                    filtrNotebook.setValueHDD(findValueHDD);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("3"):
                    System.out.println("Вы можете ввести название вашей любимой операционной системы.");
                    String findOperatingSystem = sc.nextLine();
                    filtrNotebook.setOperatingSystem(findOperatingSystem);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("4"):
                    System.out.println("Вы можете ввести название вашего любимого цвета.");
                    String findColor = sc.nextLine();
                    filtrNotebook.setColor(findColor);
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("5"):
                    printAllNotebook(notebooks);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                    break;
                case ("7"):
                    filtrNotebook.setRamInGB(0);
                    filtrNotebook.setValueHDD(0);
                    filtrNotebook.setOperatingSystem("null");
                    filtrNotebook.setColor("null");
                    System.out.println(filtrNotebook);
                    System.out.println("Введите следующую команду");
                    command = sc.nextLine();
                case ("9"):
                    information();
                    command = sc.nextLine();
                    break;
                case ("0"):
                    endOfFiltr = false;
                    break;
                default:
                    System.out.println("Вы ввели неверную команду, чтобы посмотреть инструкцию введите 9");
                    command = sc.nextLine();
                    break;
            }
        }
        System.out.println(filtrNotebook);
        findNotebooksWithFiltr(notebooks);
    }

    public static void findNotebooksWithFiltr(Set<Notbook> notebooks) {

        Set<Notbook> result = new HashSet<>();
        for (Notbook note : notebooks) {
            if (filtrNotebook.getRamInGB() <= note.getRamInGB() || filtrNotebook.getRamInGB() == 0) {
                if (filtrNotebook.getValueHDD() <= note.getValueHDD() || filtrNotebook.getValueHDD() == 0) {
                    if (filtrNotebook.getOperatingSystem().equals(note.getOperatingSystem()) || filtrNotebook.getOperatingSystem().equals("null")) {
                        if (filtrNotebook.getColor().equals(note.getColor()) || filtrNotebook.getColor().equals("null")) {
                            result.add(note);
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("К сожалению у нас для вас ничего нет(((");
        } else {
            System.out.println("Вам могут подойти следующие ноутбуки:");
            printAllNotebook(result);
        }

        System.out.println("Конец поиска!");
    }


    public static void printAllNotebook(Set<Notbook> notebooks) {
        System.out.println("В нашем интернет-магазине содержатся следующие ноутбуки:");
        System.out.println();

        for (Notbook note : notebooks) {
            System.out.println(note);
        }
        System.out.println();
    }

    public static void information() {
        System.out.println("Есди вы хотите подобрать определнный ноутбук, то введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет ");
        System.out.println("5 - вы можете посмотреть все ноутбуки, которые у нас есть");
        System.out.println("7 - очистить фильтр");
        System.out.println("9 - еще раз посмотреть инструкцию");
        System.out.println("0 - результат поиска");
    }
    
}
