package sk.ssnd.kandrac.hodina_2_5.uloha2;

import java.util.Arrays;

public class Book {

    private String title;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthor(String name) {
        String[] newAuthors = Arrays.copyOf(authors, authors.length + 1);
        newAuthors[authors.length] = name;
        authors = newAuthors;
    }
}
