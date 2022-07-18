package homework.books;

import homework.books.command.Commands;
import homework.books.model.Authors;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements Commands {


    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("invalid command");

            }
        }
    }

    private static void addAuthor() {
        System.out.println("please input author's name");
        String authorName = scanner.nextLine();
        System.out.println("please inout author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please choose author's gender");
        String gender = scanner.nextLine();

        Authors author = new Authors(authorName,surname,email,gender);
        authorStorage.add(author);
        System.out.println("author created");
    }


    private static void addBook() {
        System.out.println("please input book's title");
        String titleName = scanner.nextLine();
        System.out.println("please input author");
        String author = scanner.nextLine();
        System.out.println("please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input books count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("please input book's genre");
        String genre = scanner.nextLine();

        Book book = new Book(titleName, author, price, count, genre);
        bookStorage.add(book);
        System.out.println("book created");
    }


    private static void printBooksByGenre() {
        System.out.println("please input book's genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByPriceRange() {
        System.out.println("please input price range");
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(x, y);
    }

}
