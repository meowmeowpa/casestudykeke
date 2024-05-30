package CaseStudy;

public class Book {
    private String id;
    private String title;
    private String author;
    private int publishingYear;
    private String genre;


    public Book(String id, String title, String author, int publishingYear, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
