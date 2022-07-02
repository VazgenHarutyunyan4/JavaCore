package homework.books;

public class Book extends Author {
    private String title;
    private double price;
    private int count;
    private String genre;
    private Author author;

    public Book(String title, String authorName, double price, int count, String genre, Author author) {
        this.title = title;
        this.price = price;
        this.count = count;
        this.genre = genre;
        this.author = author;
    }

    public Book() {
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", author=" + author +
                '}';
    }


}



