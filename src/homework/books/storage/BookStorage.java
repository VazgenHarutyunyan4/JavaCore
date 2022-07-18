package homework.books.storage;

import homework.books.model.Book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;

    private void increaseArray() {
        Book[] tmp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = book;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i]);
        }
    }
    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().equals(authorName)) {
                System.out.println(array[i]);
            }
        }
    }
    public void printBooksByPriceRange(double x, double y) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= x && array[i].getPrice() <= y)
                System.out.println(array[i]);
        }
    }

    public void printBooksByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }
        }
    }
}
