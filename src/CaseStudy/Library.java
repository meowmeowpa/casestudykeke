package CaseStudy;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    final int Max_Limit = 1000;
    private Ebook[] ebooks = new Ebook[Max_Limit];
    private int count = 0;

    public void display() {
        if (count == 0) {
            System.out.println("There is no ebook in the library");
        } else {
            System.out.println("There is a list ebook in the library");
        }
        for (int i = 0; i < count; i++) {
            System.out.println(ebooks[i]);
        }


    }

    public boolean addEbook(Ebook ebook) {
        if (this.count >= Max_Limit)
            return false;
        this.ebooks[count++] = ebook;
        return true;
    }

    public boolean removeBook(String deleteBookName) {
        for (int i = 0; i < ebooks.length; i++) {
            if (ebooks[i].getTitle().equalsIgnoreCase(deleteBookName)) {
                ebooks[i] = ebooks[i + 1];
                return true;
            }
        }
        return false;
    }

    public boolean isExist(String id) {
        for (int i=0; i<count;i++) {
            if(ebooks[i].getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public void sortByTitle(boolean ascending) {
        Comparator<Ebook> comparator = Comparator.comparing(Ebook::getTitle);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(ebooks, comparator);
    }

    public void sortByAuthor(boolean ascending) {
        Comparator<Ebook> comparator = Comparator.comparing(Ebook::getAuthor);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(ebooks, comparator);
    }

    public void sortByPublishingYear(boolean ascending) {
        Comparator<Ebook> comparator = Comparator.comparing(Ebook::getPublishingYear);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(ebooks, comparator);
    }

    public void updateTitle(String id, String newTitle) {
        for (int i = 0; i < count; i++) {
            if (ebooks[i].getId().equalsIgnoreCase(id)) {//so sánh chuỗi cả chu hoa và thuơg
                ebooks[i].setTitle(newTitle);
            }
        }
    }

    public void updateAuthor(String id, String newAuthor) {
        for (int i = 0; i < count; i++) {
            if (ebooks[i].getId().equalsIgnoreCase(id)) {//so sánh chuỗi cả chu hoa và thuơg
                ebooks[i].setTitle(newAuthor);
            }
        }
    }

    public void updatePublishingYear(String id, String newPublishingYear) {
        for (int i = 0; i < count; i++) {
            if (ebooks[i].getId().equalsIgnoreCase(id)) {//so sánh chuỗi cả chu hoa và thuơg
                ebooks[i].setTitle(newPublishingYear);
            }
        }
    }
}
