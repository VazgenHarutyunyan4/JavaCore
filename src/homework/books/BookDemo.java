package homework.books;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {


        boolean run = true;
        while (run) {

            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for adding book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for printing all books");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for printing this genre's books");
            System.out.println("please input "+ PRINT_BOOKS_BY_PRICE_RANGE+" for printing this range price books");
            System.out.println("please input "+ WHO_IS_AUTHOR+" for choosing author");

            int command = Integer.parseInt(scanner.nextLine());

            switch (command){
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    bookStorage.printBooksByGenre(scanner.nextLine());
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                   printBooksByPriceRange();
                    break;
                case WHO_IS_AUTHOR:
                    inputAuthorData();
                    break;
            }


        }
    }

    private static void inputAuthorData() {
        System.out.println("please input author's name");
        String authorName = scanner.nextLine();
        System.out.println("please input author's surname");
        String authorSurname = scanner.nextLine();
        System.out.println("please input author's email");
        String authorEmail = scanner.nextLine();
        System.out.println("please input author's gender (male or female ");
        String gender = scanner.nextLine();
    }

    private static void printBooksByPriceRange() {
        System.out.println("please input min,max prices");
        String range = scanner.nextLine();
        int min = Integer.parseInt(range.split(",")[0]);
        int max = Integer.parseInt(range.split(",")[1]);
        bookStorage.priceRange(min,max);

    }

    private static void addBook() {
        System.out.println("please input book's title");
        String title = scanner.nextLine();
        System.out.println("please input author's name");
        String author = scanner.nextLine();
        System.out.println("please input book's price");
        String priceStr = scanner.nextLine();
        System.out.println("please input books count");
        String countStr = scanner.nextLine();
        System.out.println("please input book's genre");
        String genre = scanner.nextLine();
    }
}
