package DavidRiosFS.entities;

public class Book extends Literature{
    private String author;
    private String genre;

    public Book (String title, int releaseYear, int numberOfPages, String author, String genre) {
        super(title, releaseYear, numberOfPages);
        this.author = author;
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", ISBNCODE=" + ISBNCODE +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}
