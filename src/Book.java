import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Integer publishingYear;

    public Book(String title, Author author, Integer publishingYear) {
        this.title = title;
        this.author = String.valueOf(author);
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author) && publishingYear.equals(book.publishingYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }
}
