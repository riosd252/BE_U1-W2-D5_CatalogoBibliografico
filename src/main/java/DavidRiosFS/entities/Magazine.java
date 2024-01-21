package DavidRiosFS.entities;

public class Magazine extends Literature{
    private final Enum Periodicity;

    public Magazine (String title, int releaseYear, int numberOfPages, Enum periodicity) {
        super(title, releaseYear, numberOfPages);
        this.Periodicity = periodicity;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "Periodicity=" + Periodicity +
                ", ISBNCODE=" + ISBNCODE +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public Enum getPeriodicity() {
        return Periodicity;
    }

}