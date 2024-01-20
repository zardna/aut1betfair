package library;

public class Library {
    public static void main(String[] args) {
        Author backman = new Author("Backman", "fbackman@ppb.com");
        Book invingatorii = new Book("Invingatorii",backman,50.23,2023);
        System.out.println("Book "+invingatorii.getName()+" ("+ invingatorii.getPrice()+" RON),"+" by "+ invingatorii.getAuthor().getName()+", published in "+ invingatorii.getYear());

    }
}