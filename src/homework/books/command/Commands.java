package homework.books.command;

public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;


    static void printCommands(){

        System.out.println("please input " +  EXIT + " for exit" );
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for printing all books" );
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR + " for printing books by author");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for printing books by genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for printing books by price range");
    }

}
