package library;


public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    private String name;
    private String author;
    private double price;
    private int year;

    public Book(String name, String author, double price, int year) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
    }


    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }

}