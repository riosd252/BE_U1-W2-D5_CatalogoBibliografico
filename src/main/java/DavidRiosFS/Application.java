package DavidRiosFS;

import DavidRiosFS.entities.Book;
import DavidRiosFS.entities.Literature;
import DavidRiosFS.entities.Magazine;
import DavidRiosFS.utilities.Periodicity;
import com.github.javafaker.Faker;

import java.util.*;

public class Application {

    static List<Literature> warehouse = new ArrayList<>();

    public static void main(String[] args) {
        initializeWarehouse();
        System.out.println(warehouse);
        addBook();
        System.out.println(warehouse);
        addMagazine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita ISBN da cercare: ");
        long isbn = scanner.nextLong();
        findIsbn(isbn);

        System.out.println("Digita ISBN da rimuovere: ");
        long remIsbn = scanner.nextLong();
        removeIsbn(remIsbn);
        System.out.println("Elemento rimosso.");

        System.out.println("Digita anno di pubblicazione: ");
        int year = scanner.nextInt();
        findYear(year);
        scanner.nextLine();

        System.out.println("Digita autore: ");
        String author = scanner.nextLine();
        findAuthor(author);


    }

    public static void initializeWarehouse () {
        Faker faker = new Faker();
        Random rand = new Random();
        Book book1 = new Book(faker.book().title(), rand.nextInt(1700, 2024) , rand.nextInt(50, 500), faker.book().author(), faker.book().genre());
        Book book2 = new Book(faker.book().title(), rand.nextInt(1700, 2024), rand.nextInt(50, 500), faker.book().author(), faker.book().genre());
        Book book3 = new Book(faker.book().title(), rand.nextInt(1700, 2024), rand.nextInt(50, 500), faker.book().author(), faker.book().genre());
        Magazine magazine1 = new Magazine(faker.book().title(), rand.nextInt(2000, 2024), rand.nextInt(30, 50), Periodicity.BIANNUAL);
        Magazine magazine2 = new Magazine(faker.book().title(), rand.nextInt(2000, 2024), rand.nextInt(20, 40), Periodicity.MONTHLY);
        Magazine magazine3 = new Magazine(faker.book().title(), rand.nextInt(2000, 2024), rand.nextInt(15, 32), Periodicity.WEEKLY);
        Literature[] literature = {book1, book2, book3, magazine1, magazine2, magazine3};
        warehouse.addAll(Arrays.asList(literature));
    }

    public static void addBook () {
        Faker faker = new Faker();
        Random rand = new Random();
        Book newBook = new Book(faker.book().title(), rand.nextInt(1700, 2024), rand.nextInt(50, 500), faker.book().author(), faker.book().genre());
        warehouse.add(newBook);
    }

    public static void addMagazine () {
        Faker faker = new Faker();
        Random rand =  new Random();
        Magazine newMagazine = new Magazine(faker.book().title(), rand.nextInt(2000, 2024), rand.nextInt(30, 50), Periodicity.BIANNUAL);
        warehouse.add(newMagazine);
    }

    public static void removeIsbn (long isbnCode) {
        Iterator<Literature> iterator = warehouse.iterator();
        while (iterator.hasNext()) {
            Literature warehouseElement = iterator.next();
            if (warehouseElement.getISBNCODE() == isbnCode) {
                iterator.remove();
            }
        }
    }

    public static void findIsbn (long isbnCode) {
        warehouse.forEach(elem -> {if (elem.getISBNCODE() == isbnCode) {
            System.out.println(elem);
        }
        } );
    }

    public static void findYear (int releaseYear) {
        warehouse.forEach(elem -> {if (elem.getReleaseYear() == releaseYear) {
            System.out.println(elem);
        }
        } );
    }

    public static void findAuthor (String author) {
        warehouse.forEach(elem -> { if (elem instanceof Book) {
            if (((Book) elem).getAuthor().equals(author)) {
                System.out.println(elem);
            }
        }
        } );
    }
}
