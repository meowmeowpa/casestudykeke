package CaseStudy;

public class Ebook extends Book {
    private double fileSize;
    private String fileFormat;

    public Ebook(String id, String title, String author, int publishingYear, String genre, double fileSize, String fileFormat) {
        super(id, title, author, publishingYear, genre);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;

    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "ID: " + getId()
                + "  ||  Author: " + getAuthor()
                + "  ||  Title: " + getTitle()
                + "  ||  Genre: " + getGenre()
                + "  ||  Release year: " + getPublishingYear()
                + "  ||  File size: " + getFileSize()
                + "  ||  File format: " + getFileFormat();

    }
}
