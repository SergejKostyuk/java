// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheBookshelf {

    private static ArrayList<String> getListGenreBooks(String genre, String[] books) {
        ArrayList<String> genreList = new ArrayList<>(Arrays.asList(genre));
        genreList.addAll(Arrays.asList(books));
        return genreList;
    }

    public static void main(String[] args) {
        List<ArrayList<String>> bookshelf = new ArrayList<>();
        ArrayList<String> genre1 = getListGenreBooks("genre1", new String[] { "book1", "book2", "book2" });
        ArrayList<String> genre2 = getListGenreBooks("genre2", new String[] { "book1", "book2", "book2" });
        ArrayList<String> genre3 = getListGenreBooks("genre3", new String[] { "book1", "book2", "book2" });
        ArrayList<String> genre4 = getListGenreBooks("genre4", new String[] { "book1", "book2", "book2" });

        bookshelf.addAll(Arrays.asList(genre1, genre2, genre3, genre4));

        for (ArrayList<String> element : bookshelf) {
            System.out.println(element);
        }

    }

}