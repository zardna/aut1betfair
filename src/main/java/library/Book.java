package library;


public class Book {

    private String name;
    private Author author;
    private double price;
    private int year;


    public Book(String name, Author author, double price, int year) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

}