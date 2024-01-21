package DavidRiosFS.entities;

import java.util.Random;

public class Literature {
    protected final long ISBNCODE;
    protected String title;
    protected int releaseYear;
    protected int numberOfPages;

    public Literature (String title, int releaseDate, int numberOfPages) {
        Random rand = new Random();
        this.ISBNCODE = rand.nextLong();
        this.title = title;
        this.releaseYear = releaseDate;
        this.numberOfPages = numberOfPages;
    }

    public long getISBNCODE() {
        return ISBNCODE;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
