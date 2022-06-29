package homework.books;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);

        }
    }

    public void printByAuthor(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
            }

        }
    }

    public void printBooksByGenre(String bookGenre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(bookGenre)) {
                System.out.println(array[i]);
            }
        }
    }

    public void priceRange(int min, int max) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= min && array[i].getPrice() <= max){
                System.out.println(array[i]);
            }

        }
    }
}
